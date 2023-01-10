package argumentconvert;

import org.example.Message;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageTest {

    @DisplayName("Test message converter")
    @ParameterizedTest(name = "{index} => actual={0}, expected={1}")
    @CsvSource({
            "Hello, Hello",
            "hihi, hihi"
    })
    public void shouldPassMessageTest(@ConvertWith(MessageConverter.class) Message actual,
                                      @ConvertWith(MessageConverter.class) Message expected) {
        assertEquals(expected.getMessage(), actual.getMessage());
    }
}
