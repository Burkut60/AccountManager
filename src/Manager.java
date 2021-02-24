import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Manager extends AccountManager {

    UserProviderr userProvider = new UserProvider();
    ResultWithReason resultWithReason = new ResultWithReason();
    /**
     * Создает пользователя с указанными аргументами в базе данных
     *
     * @param email       почта пользователя
     * @param fullName    ФИО пользователя
     * @param phoneNumber телефонный номер пользователя
     * @return Возвращает {@link ResultWithReason}, в котором содержится информация о создании пользователя в
     * базе данных {@link UserProvider}
     */
    @Override
    ResultWithReason create(String email, String fullName, String phoneNumber) {

        User user = new User(email, fullName, phoneNumber);

        Matcher matcher = null;
        Pattern pattern = null;
        String emailCheck = user.getEmail();

        String emailValid = "^[a-zA-Z0-9]{1,}" + "((\\.|\\_|-{0,1})[a-zA-Z0-9]{1,})*" + "@"
                + "[a-zA-Z0-9]{1,}" + "((\\.|\\_|-{0,1})[a-zA-Z0-9]{1,})*" + "\\.[a-zA-Z]{2,}$";
        pattern = Pattern.compile(emailValid);
        matcher = pattern.matcher(emailCheck);


        if (matcher.matches()) {
            resultWithReason.getResult();
            userProvider.createUser(user);

        } else {
            resultWithReason.getReason();
        }
        return resultWithReason;
    }

    /**
     * Удаляет пользователя из базы данных.
     *
     * @param email Почта пользователя, по которому необходимо удалить из базы данных
     * @return Возвращает {@link ResultWithReason}, в котором содержится информация об удалении пользователя в
     * базе данных {@link UserProvider}
     */
    @Override
    ResultWithReason delete(String email) {
        userProvider.deleteUser(email);
        return null;
    }
}
