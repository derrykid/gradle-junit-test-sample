package assertJ;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class IterableTest {

    private final List<String> list = Arrays.asList("Hi", "World");

    @Test
    public void sizeTest(){
        assertThat(list).hasSize(2);
    }

    @DisplayName("List should contain the elements in the give order")
    @Test
    public void containElementInGivenOrder(){
        assertThat(list).containsExactly("Hi", "World");
    }

    @DisplayName("contain the elements in any order")
    @Test
    public void containElementInAnyOrder(){
        assertThat(list).containsExactlyInAnyOrder("World", "Hi");
    }

    @DisplayName("contain the element once")
    @Test
    public void containElementOnce(){
        assertThat(list).containsOnlyOnce("World");
    }

    @DisplayName("does not contain the element")
    @Test
    public void notContainElement(){
        assertThat(list).doesNotContain("new");
    }

    @DisplayName("Contain same element")
    @Test
    public void shouldContainSameElement(){
        List<String> first = Arrays.asList("First");
        List<String> second = Arrays.asList("First");
        assertThat(first).isEqualTo(second);
    }

}
