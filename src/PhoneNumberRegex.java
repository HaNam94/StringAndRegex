import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberRegex {
    public  static final String VALID_PHONE_NUMBER  = "^\\([\\d]{2}\\)-\\([0][\\d]{9}\\)$";

    public static void main(String[] args) {
        String[] phoneNumbers = new String[] {"(84)-(09782896428)", "(b2)-(123143345345)","(036)-(0906078190)"};
        for (String phoneNumber : phoneNumbers ){
            boolean isValid = isValidPhoneNumber(phoneNumber);
            System.out.println("Phone number" + phoneNumber + "is valid: " + isValid);
        }
    }

    private static boolean isValidPhoneNumber(String input) {
        boolean isValid = false;
        Pattern pattern = Pattern.compile(VALID_PHONE_NUMBER);
        Matcher matcher = pattern.matcher(input);
        isValid = matcher.matches();
        return isValid;
    }
}
