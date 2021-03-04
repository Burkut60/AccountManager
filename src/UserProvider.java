import java.util.HashMap;

public class UserProvider extends UserProviderr {
    ResultWithDelete resultWithDelete = new ResultWithDelete();

    public static HashMap<String, User> baseUser = new HashMap();

    @Override
    void createUser(User user) {
        String emailKay = user.getEmail();
        String phoneNam = user.getPhoneNumber();
        String name = user.getFullName();
        CheckKey.chekKey(emailKay);
        CheckPhone.chekPhone(phoneNam);
        ChekEmail.chekEmail(emailKay);
        ChekName.chekName(name);

        if (CheckKey.chekKey(emailKay) || CheckPhone.chekPhone(phoneNam) || ChekEmail.chekEmail(emailKay) ||
                ChekName.chekName(name)) {

            baseUser.put(emailKay, user);
        }
    }

    @Override
    public void deleteUser(String email) {
        if (hasUserByEmail(email)) {
            baseUser.remove(email);
        } else
            resultWithDelete.getReason();
    }

    @Override
    boolean hasUserByEmail(String email) {
        ResultUserByEmail resultUserByEmail = new ResultUserByEmail();
        if (baseUser.containsKey(email)) {
            return resultUserByEmail.getResult();
        } else {
            resultUserByEmail.getReason();
        }
        return false;
    }
}