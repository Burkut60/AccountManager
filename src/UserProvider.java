import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserProvider extends UserProviderr {
    ResultWithEmail resultWithEmail = new ResultWithEmail();
    ResultWithDelete resultWithDelete = new ResultWithDelete();
    ResultWithPhone resultWithPhone = new ResultWithPhone();
    ResultWithName resultWithName = new ResultWithName();

    public static HashMap<String, User> baseUser = new HashMap();

    @Override
    boolean createUser(User user) {
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

        while (true) {

            if (matcher.matches()) {
                resultWithEmail.getResult();
            } else {
                resultWithEmail.getReason();
            }
            if (matcher1.matches()) {
                resultWithPhone.getResult();
            } else {
                resultWithPhone.getReason();
            }

            if (matcher2.matches()) {
                resultWithName.getResult();
            } else {
                resultWithName.getReason();
            }
            baseUser.put(emailKay, user);

            break;
        }
        return false;
    }

    @Override
    public boolean deleteUser(String email) {
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