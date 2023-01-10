package assertJ;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BooleanTest {

    @Test
    public void shouldBeTrue(){
        assertThat(true).isTrue();
    }

    @Test
    void shouldBeFalse(){
        assertThat(false).isFalse();
    }
}
