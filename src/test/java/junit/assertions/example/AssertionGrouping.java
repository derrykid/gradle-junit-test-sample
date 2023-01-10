package junit.assertions.example;

import org.example.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertionGrouping {

    private Person person;
    private static final String FIRST_NAME = "Jane";
    private static final String LAST_NAME = "Doe";

    @BeforeEach
    void createPerson(){
        person = new Person();
        person.setFirstname(FIRST_NAME);
        person.setLastname(LAST_NAME);
    }

    @Test
    public void testGroupingAssertions(){
        assertAll("name",
                ()-> assertEquals(FIRST_NAME, person.getFirstname(), "First name wrong"),
                ()-> assertEquals(LAST_NAME, person.getLastname(), "Last name wrong")
        );
    }
}
