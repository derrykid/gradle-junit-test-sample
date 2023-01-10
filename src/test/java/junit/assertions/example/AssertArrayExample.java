package junit.assertions.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AssertArrayExample {
    private final int[] ACTUAL = new int[]{2, 5, 7};
    private final int[] EXPECTED = new int[]{2, 5, 7};

    @Test
    public void shouldContainSameElement(){
        assertArrayEquals(EXPECTED, ACTUAL);
    }
}
