public class ResultWithPhone extends  ResultWithReason {
    @Override
    boolean getResult() {
        System.out.println(" Phone ok");
        return false;
    }

    @Override
    String getReason() {
        ReasonPhone reasonPhone = new ReasonPhone();
      return   reasonPhone.getText();
    }
}
