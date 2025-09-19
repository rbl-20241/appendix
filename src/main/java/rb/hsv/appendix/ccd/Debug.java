package rb.hsv.appendix.ccd;

import java.io.File;
import java.util.Arrays;

public class Debug {

    private final static String FILE = "Num-07.html";
    private final static int VERSE = 42;
    private final static String ARG1 = "zesde";
    private final static String ARG2 = "dag";

    public static boolean isDebug(final File file, final String... args) {
        if (!ARG2.isBlank()) {
            return file.getName().endsWith(FILE) &&
                    Arrays.stream(args).anyMatch(arg -> arg.contains(ARG1)) &&
                    Arrays.stream(args).anyMatch(arg -> arg.contains(ARG2));

        } else {
            return file.getName().endsWith(FILE) &&
                    Arrays.stream(args).anyMatch(arg -> arg.contains(ARG1));
        }
    }

    public static boolean isDebug(final File file, final int vs, final String... args) {
        if (!ARG2.isBlank()) {
            return file.getName().endsWith(FILE) &&
                    vs == VERSE &&
                    Arrays.stream(args).anyMatch(arg -> arg.contains(ARG1)) &&
                    Arrays.stream(args).anyMatch(arg -> arg.contains(ARG2));

        } else {
            return file.getName().endsWith(FILE) &&
                    vs == VERSE &&
                    Arrays.stream(args).anyMatch(arg -> arg.contains(ARG1));
        }
    }

    public static boolean isDebug(final String... args) {
        return Arrays.stream(args).anyMatch(arg -> arg.equalsIgnoreCase(ARG1));
    }

    public static boolean isDebug(final File file) {
        return file.getName().endsWith(FILE);
    }

}
