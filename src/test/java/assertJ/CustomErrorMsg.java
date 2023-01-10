package assertJ;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomErrorMsg {

    @Test
    void shouldBeFalseWithCustomMessage() {
        assertThat(false)
                .describedAs("The boolean is not false")
                .isFalse();
    }

    @Test
    void overridingErrorMessage(){
        assertThat(false)
                .overridingErrorMessage("The boolean is not false")
                .isFalse();
    }
}
