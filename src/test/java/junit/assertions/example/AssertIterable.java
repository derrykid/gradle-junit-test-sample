package junit.assertions.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class AssertIterable {
    private final List<Integer> FIRST = Arrays.asList(1, 2, 3);
    private final List<Integer> SECOND = Arrays.asList(1, 2, 3);

    @Test
    public void shouldBeEqualList(){
        assertIterableEquals(FIRST, SECOND);
    }

}
