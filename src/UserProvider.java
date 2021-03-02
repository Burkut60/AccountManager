import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserProvider extends UserProviderr {

    public static HashMap<String, User> baseUser = new HashMap();

    @Override
    boolean createUser(User user) {
        ResultWithEmail resultWithEmail = new ResultWithEmail();
        String emailKay = user.getEmail();
        String phoneNam = user.getPhoneNumber();
        String name = user.getFullName();

        String phoneValid = ("(\\+[0-9]{3})?\\(?[0-9]{2}\\)?[0-9]{3}-?[0-9]{2}-?[0-9]{2}");
        String nameValid = "([A-Z][a-z]*)(?:,\\s*)?";
        String emailValid = "^[a-zA-Z0-9]{1,}" + "((\\.|\\_|-{0,1})[a-zA-Z0-9]{1,})*" + "@"
                + "[a-zA-Z0-9]{1,}" + "((\\.|\\_|-{0,1})[a-zA-Z0-9]{1,})*" + "\\.[a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compile(emailValid);
        Matcher matcher = pattern.matcher(emailKay);

        Pattern pattern2 = Pattern.compile(nameValid);
        Matcher matcher2 = pattern2.matcher(name);

        Pattern pattern1 = Pattern.compile(phoneValid);
        Matcher matcher1 = pattern1.matcher(phoneNam);

        if (matcher.matches() && matcher1.matches() && matcher2.matches()) {
            baseUser.put(emailKay, user);
            return resultWithEmail.getResult();
        } else {
            resultWithEmail.getReason();
        }
        return false;
    }

    @Override
    public boolean deleteUser(String email) {
        ResultWithDelete resultWithDelete = new ResultWithDelete();
        baseUser.remove(email);
        if (hasUserByEmail(email)) {
            return resultWithDelete.getResult();
        } else
            resultWithDelete.getReason();
        return false;
    }

    @Override
    boolean hasUserByEmail(String email) {
        if (!baseUser.containsKey(email)) ;
        return true;
    }
}