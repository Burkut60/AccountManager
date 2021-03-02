

public class Manager extends AccountManager {

    UserProvider userProvider = new UserProvider();
    ResultWithEmail resultWithEmail = new ResultWithEmail();
    ResultWithDelete resultWithDelete = new ResultWithDelete();

    @Override
    ResultWithEmail create(String email, String fullName, String phoneNumber) {
        User user = new User(email, fullName, phoneNumber);
        userProvider.createUser(user);
        return resultWithEmail;
    }

    @Override
    ResultWithDelete delete(String email) {
        userProvider.deleteUser(email);
        return resultWithDelete;
    }
}
