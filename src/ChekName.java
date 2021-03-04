import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChekName {
    public static boolean chekName(String name){
        ResultWithName resultWithName = new ResultWithName();
        String nameValid = "([A-Z][a-z]*)(?:,\\s*)?";
        Pattern pattern2 = Pattern.compile(nameValid);
        Matcher matcher2 = pattern2.matcher(name);

        if (matcher2.matches()) {
         return    resultWithName.getResult();
        } else {
            resultWithName.getReason();
        }
        return false;
    }

}
