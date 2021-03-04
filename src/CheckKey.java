public class CheckKey {

    public static boolean chekKey(String key) {
        ResultWithKey resultWithKey = new ResultWithKey();

        if (key != null && UserProvider.baseUser.containsKey(key)) {
            return resultWithKey.getResult();
        } else {
            resultWithKey.getReason();
        }
        return false;
    }
}