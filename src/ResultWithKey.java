public class ResultWithKey extends  ResultWithReason {
    @Override
    boolean getResult() {
        System.out.println("There is already such a key in the database.");
        return true;
    }

    @Override
    String getReason() {
        ReasonKey reasonKey = new ReasonKey();
        return reasonKey.getText();
    }
}
