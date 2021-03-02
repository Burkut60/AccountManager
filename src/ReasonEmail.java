
public class ReasonEmail extends Reason {
    @Override
    String getText() {
        String not = "email does not match";
        System.out.println(not);
        return not;
    }
}
