import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    private static final Pattern pattern = Pattern.compile("^[CAP]{1}+[0-9]{4}+[GHIKLM]{1}+$");

    public static boolean validateClass(String regex) {
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(validateClass("C0318G"));

        System.out.println(validateClass("M0318G"));

        System.out.println(validateClass("P0323A"));
    }
}
