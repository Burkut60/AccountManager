import java.util.HashMap;
import java.util.Map;


 public class UserProvider extends UserProviderr {

public static Map<String,User> baseUser = new HashMap();


     /**
      * Метод должен создавать пользователя в базе данных
      * @param user Пользователь, которого нам необходимо занести в базу данных
      * @return Возвращает true, если нам удалось успешно добавить пользователя в базу данных, иначе false
      */
    @Override
   boolean createUser(User user) {
        String emailKay = user.getEmail();
        baseUser.put(emailKay,user);
        System.out.println("ok");

        return true;
    }
     /**
      * Удалят пользователя с базы данных
      * @param email почта пользователя, которого мы должны удалить
      * @return Возвращает true, если нам удалось успешно удалить пользователя, иначе false
      */
    @Override
    public boolean deleteUser(String email) {
        baseUser.remove(email);
        if (baseUser.containsKey(email)){
            System.out.println("Не удалось удалить");
            return false;
        }else {

        System.out.println("Удалили");
        return true;
        }
    }
     /**
      * Данный метод проверяет, если ли пользователь с таким email в нашей базе данных
      * @param email Почта клиента
      * @return Возвращает true, если удалось найти данного пользователя в базе данных, иначе false
      */
    @Override
    boolean hasUserByEmail(String email) {

        return false;
    }

}