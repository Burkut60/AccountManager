
public class ResultWithDelete extends ResultWithReason {
    @Override
    boolean getResult() {
        System.out.println("Delete Ok");
        return true;
    }

    @Override
    String getReason() {
        ReasonDelete reasonDelete = new ReasonDelete();
        return reasonDelete.getText();
    }
}
