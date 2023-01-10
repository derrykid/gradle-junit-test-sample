package assertJ;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NullTest {

    private final Object object = null;

    @Test
    public void notNull(){
        assertThat(new Object()).isNotNull();
    }

    @Test
    public void nullObject(){
        assertThat(object).isNull();
    }
}
