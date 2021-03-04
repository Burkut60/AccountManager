import java.util.regex.Matcher;
import java.util.regex.Pattern;

public  class CheckPhone {

    public static boolean chekPhone(String phone){
        ResultWithPhone resultWithPhone = new ResultWithPhone();
        String phoneValid = ("(\\+[0-9]{3})?\\(?[0-9]{2}\\)?[0-9]{3}-?[0-9]{2}-?[0-9]{2}");
        Pattern pattern1 = Pattern.compile(phoneValid);
        Matcher matcher1 = pattern1.matcher(phone);
        if (matcher1.matches()) {
          return   resultWithPhone.getResult();
        } else {
            resultWithPhone.getReason();
        }return false;
    }
}
