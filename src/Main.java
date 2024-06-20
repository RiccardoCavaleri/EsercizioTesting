import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

    }
    public static String dataTest (OffsetDateTime dateTime){
        return dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
    }
    public static String testData(OffsetDateTime dateTime){
        return dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
    }
}
