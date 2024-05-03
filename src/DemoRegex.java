import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;

public class DemoRegex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]{25}$");
        Matcher matcher = pattern.matcher("Xavdfghjkloiuytrewqasdfghz");
        boolean isMatched = matcher.matches();
        System.out.println("Result: " + isMatched);
    }
}
