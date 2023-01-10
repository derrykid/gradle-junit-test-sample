package assertJ;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class OptionalTest {

    private final Object object = new Object();

    @Test
    public void shouldBeEmpty(){
        assertThat(Optional.empty()).isEmpty();
    }

    @Test
    public void shouldNotBeEmpty(){
        assertThat(Optional.of(new Object())).isNotEmpty();
    }

    @DisplayName("Contain the expected object")
    @Test
    public void containExpectedObject(){
        Object object = new Object();
        assertThat(Optional.of(object)).contains(object);
    }
}

