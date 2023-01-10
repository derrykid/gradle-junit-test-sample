package assertJ;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class MapTest {

    private static final String INCORRECT_KEY = "incorrectKey";
    private static final String KEY = "key";
    private static final String VALUE = "value";

    private Map<String, String> map;

    @BeforeEach
    public void init(){
        map = new HashMap<>();
        map.put(KEY, VALUE);
    }

    @Test
    public void containKey(){
        assertThat(map).containsKey(KEY);
    }

    @Test
    public void notContainKey(){
        assertThat(map).containsKey(INCORRECT_KEY);
    }

    @Test
    public void containEntry(){
        assertThat(map).containsEntry(KEY, VALUE);
    }

    @Test
    public void notContainEntry(){
        assertThat(map).doesNotContainEntry(INCORRECT_KEY, VALUE);
    }
}
