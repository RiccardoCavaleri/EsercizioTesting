import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void dataTest() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String dataFormat = Main.dataTest(dateTime);
        String formatData = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));

        assertEquals(formatData, dataFormat, "dovrebbe essere true");
    }

    @Test
    void testData() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String dataFormat = Main.testData(dateTime);
        String formatData = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));

        assertEquals(formatData, dataFormat, "dovrebbe essere true");
    }
}