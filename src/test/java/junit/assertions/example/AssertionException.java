package junit.assertions.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionException {

    @DisplayName("Throw a expected exception")
    @Test
    public void shouldThrowCorrectExceptionMessage() {
        assertThrows(
                NullPointerException.class,
                () -> {
                    throw new NullPointerException();
                }
        );
    }

    @Test
    public void shouldThrowExceptionWithCorrectMessage() {
        final NullPointerException ex = assertThrows(
                NullPointerException.class,
                () -> {
                    throw new NullPointerException("Hello World");
                }
        );
        assertEquals("Hello World", ex.getMessage());
    }

    @DisplayName("Should not throw exception")
    @Test
    public void shouldNotThrowException(){
        assertDoesNotThrow(() -> {});
    }

    @DisplayName("Not throw exception, and sysout expected value test")
    @Test
    public void shouldNotThrowExceptionAndSysoutExpectedValue(){
        String message = assertDoesNotThrow(() -> {return "Hello World";});
        assertEquals("Hello World", message);
    }
}
