import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChekEmail {

    public static boolean chekEmail(String email) {

        ResultWithEmail resultWithEmail = new ResultWithEmail();
        String emailValid = "^[a-zA-Z0-9]{1,}" + "((\\.|\\_|-{0,1})[a-zA-Z0-9]{1,})*" + "@"
                + "[a-zA-Z0-9]{1,}" + "((\\.|\\_|-{0,1})[a-zA-Z0-9]{1,})*" + "\\.[a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compile(emailValid);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return resultWithEmail.getResult();
        } else {
            resultWithEmail.getReason();
        }

        return false;
    }
}
