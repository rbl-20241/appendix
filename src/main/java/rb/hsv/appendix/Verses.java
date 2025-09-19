package rb.hsv.appendix;

import rb.hsv.appendix.ccd.CreateConcordantie;

import static rb.hsv.appendix.Util.setLineSeparator;

public class Verses {

    public static void main(String[] args) {
        init();
        if (args.length == 3) {
            if (args[0].equals("-a")) {
                AddToAppendix addToAppendix = new AddToAppendix();
                addToAppendix.run(args[1], args[2]);
            }
        }
        else if (args.length == 2) {
            if (args[0].equals("-s")) {
                CheckArgument checkArgument = new CheckArgument();
                checkArgument.run(args[1]);
            }
            else if (args[0].equals("-S")) {
                CheckArgument checkArgument = new CheckArgument();
                checkArgument.run(args[1], true);
            }
        }
        else if (args.length == 1) {
            if (args[0].equals("-c")) {
                CompareFiles compareFiles = new CompareFiles();
                compareFiles.run();
            }
            else if (args[0].equals("-cnt")) {
                SearchArguments searchArguments = new SearchArguments(false, true);
                searchArguments.run();
            }
            else if (args[0].equals("-con")) {
                CreateConcordantie createConcordantie = new CreateConcordantie();
                createConcordantie.run();
            }
            else if (args[0].equals("-p")) {
                SearchPericopes searchPericopes = new SearchPericopes();
                searchPericopes.run();
            }
//            else if (args[0].equals("-rs")) {
//                RemoveConSpan removeConSpan = new RemoveConSpan();
//                removeConSpan.run();
//            }
            else if (args[0].equals("-s")) {
                SearchArguments searchArguments = new SearchArguments(true, false);
                searchArguments.run();
            }
            else if (args[0].equals("-t")) {
                TextOnly textOnly = new TextOnly();
                textOnly.run();
            }
            else if (args[0].equals("-tc")) {
                TextOnly textOnly = new TextOnly();
                textOnly.run();
                CompareFiles compareFiles = new CompareFiles();
                compareFiles.run();
            }
            else if (args[0].equals("-u")) {
                UpdateIndex updateIndex = new UpdateIndex();
                updateIndex.run(false);
            }
            else if (args[0].equals("-h") || args[0].equals("-?")) {
                System.out.println("Verses");
                System.out.println();
                System.out.println("Options:");
                System.out.println("-a [prefix] [file.txt] write all the search-arguments in file.txt with prefix in appendix.txt");
                System.out.println("-c                     compare files in folder \"textonly\" with files in folder \"textonly.org\" and save results in filecompare.txt");
                System.out.println("-cnt                   count all the active search-arguments in verses.txt");
                System.out.println("-con                   create concordantie which are in concordantie.txt");
                System.out.println("-p                     search all pericopes");
                System.out.println("-rs                    remove concordatie-span");
                System.out.println("-s                     search all the active search-arguments in verses.txt");
                System.out.println("-s [argument]          search argument (not case-sensitive");
                System.out.println("-S [argument]          search argument (case-sensitive)");
                System.out.println("-t                     create textonly files in the folder \"textonly\"");
                System.out.println("-tc                    create textonly files in the folder \"textonly\" and compare these files with files in folder \"textonly.org\" and save results in filecompare.txt");
                System.out.println();

                System.out.println();
            }
        }
        else if (args.length == 0) {
            SearchArguments searchArguments = new SearchArguments(true, true);
            searchArguments.run();
        }
    }

    private static void init() {
        setLineSeparator();
    }
}
