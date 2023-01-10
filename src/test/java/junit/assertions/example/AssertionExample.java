package junit.assertions.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionExample {

    @Test
    public void whenBooleanIsTrue(){
        assertTrue(true);
    }

    @Test
    public void whenBooleanIsFalse(){
        assertFalse(false);
    }

    @Test
    public void whenObjectIsNull(){
        assertNull(null);
    }

    @Test
    public void whenObjectIsNotNull(){
        assertNotNull(new Object());
    }


}
