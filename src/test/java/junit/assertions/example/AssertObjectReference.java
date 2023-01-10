package junit.assertions.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

public class AssertObjectReference {

    private final Object ACTUAL = new Object();
    private final Object EXPECTED = ACTUAL;

    private final Object ACTUAL2 = new Object();
    private final Object EXPECTED2 = new Object();
    @Test
    public void shouldReferToTheSameObject(){
        assertSame(EXPECTED, ACTUAL);
    }

    @DisplayName("Should not be the same")
    @Test
    public void shouldReferToTheSameObjectNotSame(){
        assertNotSame(EXPECTED2, ACTUAL2);
    }
}
