public class ResultUserByEmail extends  ResultWithReason {
    @Override
    boolean getResult() {
        System.out.println("Is in the database ");
        return true;
    }

    @Override
    String getReason() {
        ReasonUserByEmail reasonUserByEmail = new ReasonUserByEmail();
        return reasonUserByEmail.getText();
    }
}
