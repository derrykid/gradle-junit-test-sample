package assertJ;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Assert that objects or values are equal")
public class ObjectEqualTest {

    @Test
    public void equalObject(){
        Integer a = 9;
        Integer b = 9;

        assertThat(a).isEqualByComparingTo(b);
    }

    @Test
    public void notEqualObject(){
        Integer a = 8;
        Integer b = 2;

        assertThat(a).isNotEqualByComparingTo(b);
    }
}
