package junit.assertions.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertionCustomMessage {

    @Test
    public void shouldBeTrue(){
        assertTrue(false, "This should be true, but it's false");
    }

    @DisplayName("The custom message is provided by a supplier, this doesn't override the default msg but prefix it")
    @Test
    public void shouldBeFalse(){
        assertFalse(true,
                ()-> String.format("This supposed to be %s", "false"));
    }
}
