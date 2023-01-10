package assertJ;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ObjectReferenceTest {

    private final Object ACTUAL = new Object();
    private final Object EXPECTED = ACTUAL;

    private final Object ACTUAL2 = new Object();
    private final Object EXPECTED2 = new Object();

    @Test
    public void referToSameObject(){
        assertThat(ACTUAL).isSameAs(EXPECTED);
    }

    @Test
    public void referToDifferentObject(){
        assertThat(ACTUAL2).isNotSameAs(EXPECTED2);
    }
}
