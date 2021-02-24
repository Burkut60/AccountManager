import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResultWithReason extends ResultWithReasonn {

    /**
     * Возвращает результат операции
     * @return true если операция была успешно выполнена, иначе false
     */
    @Override
   boolean getResult() {
        System.out.println("Matches");
            return true;
    }


    /**
     * Возвращает причину операции. Например, если наша операция была не выполнена, то мы можем посмотреть,
     * по какой причине она была не выполнена
     * @return Возвращает причину, по которой она была не выполнена
     * Дополнительно: а если она будет выполнена успешно, то может вернуть какую-нибудь успешную причину?
     */

    @Override
    Reason getReason() {
        Reason reason = new Reason();
        System.out.println(reason.getText());
        return reason ;
    }
}

