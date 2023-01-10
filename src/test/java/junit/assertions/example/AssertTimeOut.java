package junit.assertions.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class AssertTimeOut {

    @DisplayName("return correct message before time out. It runs on the same thread as the main")
    @Test
    public void shouldReturnCorrectMessageBeforeTimeOut() {

        // Duration.ofMillis specifies the timeout that 'this test' emphasis
        final String message = assertTimeout(Duration.ofMillis(100), () -> {
            Thread.sleep(20);
            return "Hello, World";
        });

        assertEquals("Hello, World", message);
    }

    @DisplayName("Should return the correct msg before timeout is exceeded. Runs on different thread, and if fails, will abort")
    @Test
    void shouldReturnCorrectMessageBeforeTimeoutIsExceeded() {
        final String message = assertTimeoutPreemptively(Duration.ofMillis(50), () -> {
            Thread.sleep(20);
            return "Hello World!";
        });
        assertEquals("Hello World!", message);
    }

}
