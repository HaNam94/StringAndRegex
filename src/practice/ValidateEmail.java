package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    private static Pattern pattern = Pattern.compile("^[\\w]+[A-Za-z0-9]*@[A-Za-z]+[\\d]*(\\.[A-Za-z]+)$");

    public static void main(String[] args) {
        String input = "NamHa.94@gmail.com";
        System.out.println("Result:" + checkEmail(pattern, input));
    }

    private static boolean checkEmail(Pattern pattern, String input) {
        boolean isMatched;
        Matcher matcher = pattern.matcher(input);
        isMatched = matcher.matches();
        return isMatched;
    }
}
