package rb.hsv.appendix;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static rb.hsv.appendix.Constants.*;
import static rb.hsv.appendix.Util.*;

public class CheckArgument {

    private BufferedWriter writer;
    private Map<Integer, StringBuilder> map; // = new TreeMap<>();
    private ArrayList<File> filesInRoot;
    private ArrayList<File> filesInTextOnly;
    private List<String> resultInRoot;
    private List<String> resultInTextOnly;
    private boolean newBook;
    private boolean isCaseSensitive;

    public void run(String argument) {
        run(argument, false);
    }

    public void run(String argument, boolean isCaseSensitive) {
        this.isCaseSensitive = isCaseSensitive;
        resultInRoot = new ArrayList<>();
        resultInTextOnly = new ArrayList<>();
        try {
            writer = new BufferedWriter(new FileWriter(RESULT));
            Stream<String> arguments = getArguments(argument);
            arguments.forEach(arg -> {
                filesInRoot = findFiles(ROOT);
                readFiles(arg, filesInRoot);
            });
            showText(argument, filesInRoot, ROOT);
            writer.write("===============================================================================");
            writer.write(getLineSeparator());

            arguments = getArguments(argument);
            arguments.forEach(arg -> {
                filesInTextOnly = findFiles(TEXTONLY_DIR);
                readFiles(arg, filesInTextOnly);
            });
            showText(argument, filesInTextOnly, TEXTONLY_DIR);
            writer.write("===============================================================================");
            writer.write(getLineSeparator());

            compareLists();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private ArrayList<File> findFiles(String folder) {
        ArrayList<File> files = new ArrayList<>();
        File dir = new File(folder);
        Collection<File> col = FileUtils.listFiles(dir, EXTENSIONS, false);

        files.addAll(col);

        return files;
    }

    private void readFiles(String argument, ArrayList<File> files) {
        List<String> lines = new ArrayList<>();
        String bookRef = "";
        String oldBookRef = "";
        StringBuilder sb = new StringBuilder();
        boolean isEndOfVerses = false;
        map = new TreeMap<>();

        for (File thisFile : files) {
            isEndOfVerses = false;
            if (checkFile(thisFile.getName())) {
                bookRef = getBookRef(thisFile.getName());

                if (bookRef != null) {
                    if (!bookRef.equals(oldBookRef)) {
                        if (sb.length() > 0) {
                            int index = getBookIndex(oldBookRef);
                            map.put(index, sb);
                        }
                        sb = new StringBuilder();
                        newBook = true;
                    }

                    try (BufferedReader br = Files.newBufferedReader(Paths.get(thisFile.toURI()))) {

                        lines = br.lines().collect(Collectors.toList());

                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    String vs = "";
                    String chapter = getChapter(thisFile.getName(), true);
                    for (int l = 0; l < lines.size(); l++) {
                        String line = lines.get(l);

                        if (line.contains("class=\"footnote1")) {
                            isEndOfVerses = true;
                        }

                        if (!isEndOfVerses) {
                            if (line.contains("id=\"vs")) {
                                vs = getVerseNumber(line);
                            }

                            boolean isFound = isCaseSensitive ? line.contains(argument) :
                                    line.toLowerCase().contains(argument.toLowerCase());

                            if (isFound) {
                                if (newBook) {
                                    sb.append("\t\t\t").append(bookRef);
                                    newBook = false;
                                } else {
                                    sb.append("; ");
                                }

                                if (isOneChapterBook(bookRef)) {
                                    sb.append(" ")
                                        .append("vs ")
                                        .append(vs);
                                } else {
                                    sb.append(" ")
                                            .append(chapter)
                                            .append(":")
                                            .append(vs);
                                }
                            } // if (line.contains(id))
                        } // for lines

                        oldBookRef = bookRef;
                    } // if (bookRef != null)
                } // if (checkFile(thisFile.getName()))
            }
        } // for (int i = 0; i < files.size(); i++)
        if (sb.length() > 0) {
            int index = getBookIndex(bookRef);
            map.put(index, sb);
        }

        saveResult(map, argument);
    }

    private <K, V> void saveResult(Map<K, V> map, String id) {
        System.out.println(id);
        try {
            writer.write(id);
            writer.write(getLineSeparator());
            int i = 0;
            for (Map.Entry<K, V> entry : map.entrySet()) {
                if (i > 0) {
//                    writer.write(";&#160;");
                    writer.write(getLineSeparator());
                }
                System.out.println(entry.getValue());
                writer.write(entry.getValue().toString());
                i++;
            }
            System.out.println("");
            System.out.println("===============================================================================");
            System.out.println("");
            writer.write(getLineSeparator());
            writer.write(getLineSeparator());
            writer.write("===============================================================================");
            writer.write(getLineSeparator());
            writer.write(getLineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showText(final String argument, ArrayList<File> files, String folder) {
        List<String> lines = new ArrayList<>();
        String bookRef = "";
        StringBuilder sb = new StringBuilder();
        boolean isEndOfVerses = false;

        for (File thisFile : files) {
            isEndOfVerses = false;
            if (checkFile(thisFile.getName())) {
                bookRef = getBookRef(thisFile.getName());

                if (bookRef != null) {
                    try (BufferedReader br = Files.newBufferedReader(Paths.get(thisFile.toURI()))) {
                        lines = br.lines().collect(Collectors.toList());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    String vs = "";
                    String chapter = getChapter(thisFile.getName(), true);
                    for (int l = 0; l < lines.size(); l++) {
                        String line = lines.get(l);

                        if (line.contains("class=\"footnote1")) {
                            isEndOfVerses = true;
                        }

                        if (!isEndOfVerses) {
                            if (line.contains("id=\"vs") || line.contains("class=\"poetry\"")) {
                                if (line.contains("id=\"vs")) {
                                    vs = getVerseNumber(line);
                                }

                                final String convertedLine = convertLine(line);
                                boolean isFound = isCaseSensitive ? convertedLine.contains(argument) :
                                        convertedLine.toLowerCase().contains(argument.toLowerCase());

                                if (isFound) {
                                    String ref = bookRef + chapter + ":" + vs;
                                    sb = new StringBuilder();
                                    sb.append(ref).append("\t\t\t").append(convertedLine);
//                                    sb.append(bookRef)
//                                            .append(chapter)
//                                            .append(":")
//                                            .append(vs)
//                                            .append("\t\t\t")
//                                            .append(convertedLine);

                                    if (folder.equals(ROOT)) {
                                        resultInRoot.add(ref);
                                    }
                                    else if (folder.equals(TEXTONLY_DIR)) {
                                        resultInTextOnly.add(ref);
                                    }
                                    try {
                                        System.out.println(sb);
                                        System.out.println("");

                                        writer.write(sb.toString());
                                        writer.write(getLineSeparator());
                                        writer.write(getLineSeparator());
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                } // if (isFound) {
                            } // if (line.contains("id=\"vs")) {
                        } // if (!isEndOfVerses) {
                    } // for (int l
                } // if (bookRef != null)
            } // if (checkFile
        } // for (File thisFile : files) {
    }

    private void compareLists() {
        Collection<String> rootList = resultInRoot;
        Collection<String> textOnlyList = resultInTextOnly;

        List<String> resultRootList = new ArrayList<String>(rootList);
        List<String> resultTextOnlyList = new ArrayList<String>(textOnlyList);

        resultRootList.removeAll(textOnlyList);
        resultTextOnlyList.removeAll(rootList);

        try {
            if (resultRootList.size() > 0) {
                writer.write("Verschil(len):");
                writer.write(getLineSeparator());
                System.out.println("Verschil(len):");
                resultRootList.stream().forEach(item -> {
                    try {
                        writer.write(item);
                        writer.write(getLineSeparator());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println(item);
                });
            } else if (resultTextOnlyList.size() > 0) {
                writer.write("Verschil(len):");
                writer.write(getLineSeparator());
                System.out.println("Verschil(len):");
                resultTextOnlyList.stream().forEach(item -> {
                    try {
                        writer.write(item);
                        writer.write(getLineSeparator());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println(item);
                });
            } else {
                writer.write("Geen verschillen gevonden");
                writer.write(getLineSeparator());
                System.out.println("Geen verschillen gevonden");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Stream<String> getArguments(String argument) {
        ArrayList<String> arguments = new ArrayList<>();
        arguments.add(argument + "a");
        arguments.add(argument + "b");
        arguments.add(argument + "c");
        arguments.add(argument + "d");
        arguments.add(argument + "e");
        arguments.add(argument + "f");
        arguments.add(argument + "g");
        arguments.add(argument + "h");
        arguments.add(argument + "i");
        arguments.add(argument + "j");
        arguments.add(argument + "k");
        arguments.add(argument + "l");
        arguments.add(argument + "m");
        arguments.add(argument + "n");
        arguments.add(argument + "o");
        arguments.add(argument + "p");
        arguments.add(argument + "q");
        arguments.add(argument + "r");
        arguments.add(argument + "s");
        arguments.add(argument + "t");
        arguments.add(argument + "u");
        arguments.add(argument + "v");
        arguments.add(argument + "w");
        arguments.add(argument + "x");
        arguments.add(argument + "y");
        arguments.add(argument + "z");
        arguments.add(argument + "&#");
        arguments.add(argument + "-");
        arguments.add("-" + argument);

        return arguments.stream();
    }

    private String convertLine(String line) {
        String newLine = line;
//        while (newLine.contains("<")) {
//            int i = newLine.indexOf("<");
//            int j = newLine.indexOf(">");
//            try {
//                newLine = newLine.substring(0, i) + newLine.substring(j + 1);
//            }
//            catch (OutOfMemoryError e) {
//                System.out.println("Fout in: " + line);
//            }
//        }

        return newLine;
    }
}
