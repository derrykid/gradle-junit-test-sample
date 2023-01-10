package assertJ;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayTest {
    final int[] ACTUAL = new int[]{2, 5, 7};
    final int[] EXPECTED = new int[]{2, 5, 7};

    @Test
    public void shouldBeSameArray(){
        assertThat(ACTUAL).isEqualTo(EXPECTED);
    }

    @Test
    public void shouldNotBeSameArray(){
        final int[] EXPECTED2 = new int[]{3, 1, 5};
        assertThat(ACTUAL).isEqualTo(EXPECTED2);
    }
}
