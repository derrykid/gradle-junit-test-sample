package assertJ;

import org.assertj.core.internal.bytebuddy.implementation.bytecode.Throw;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ExceptionTest {


    @Test
    public void shouldThrowCorrectException() {
        assertThatThrownBy(() -> {
            throw new NullPointerException();
        })
                .isExactlyInstanceOf(NullPointerException.class);
    }

    @Test
    public void shouldThrowExpectedMessage() {
        assertThatThrownBy(() -> {
                    throw new NullPointerException("Hello");
                }
        ).hasMessage("Hello");
    }

    @DisplayName("Catch the exception")
    @Test
    public void shouldThrowCorrectExceptionByVar(){
        final Throwable thrown = catchThrowable(()-> {
            throw new NullPointerException();
        });

        assertThat(thrown).isExactlyInstanceOf(NullPointerException.class);
    }

    @Test
    public void shouldThrowCorrectExceptionMessageByVar() {
        final Throwable thrown = catchThrowable(() -> {
            throw new NullPointerException("Hello");
        });

        assertThat(thrown.getMessage()).isEqualTo("Hello");
    }
}
