public class ResultWithEmail extends ResultWithReason {


    @Override
    boolean getResult() {
        System.out.println("Email ok");
        return true;
    }

    @Override
    String getReason() {
        ReasonEmail reason = new ReasonEmail();
        return reason.getText();
    }
}

