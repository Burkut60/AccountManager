public class ResultWithName extends  ResultWithReason {
    @Override
    boolean getResult() {
        System.out.println("Name ok");
        return true;
    }

    @Override
    String getReason() {
        ReasonName reasonName = new ReasonName();
      return   reasonName.getText();
    }
}
