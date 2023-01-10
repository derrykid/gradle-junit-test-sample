package junit.assertions.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AssertEqualExample {
    private final Integer ACTUAL = 9;
    private final Integer EXPECTED = 9;

    private final Integer ACTUAL2 = 3;
    private final Integer EXPECTED2 = 8;

    @Test
    public void whenObjectsAreInteger(){
        assertEquals(EXPECTED, ACTUAL);
    }

    @DisplayName("Should not be equal")
    @Test
    public void whenObjectsAreInteger2(){
        assertNotEquals(EXPECTED2, ACTUAL2);
    }
}
