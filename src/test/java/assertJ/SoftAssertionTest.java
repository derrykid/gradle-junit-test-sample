package assertJ;

import org.assertj.core.api.SoftAssertions;
import org.example.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SoftAssertionTest {
    private static final String FIRST_NAME = "Jane";
    private static final String LAST_NAME = "Doe";

    private Person person;

    @BeforeEach
    void createPerson() {
        person = new Person();
        person.setFirstname(FIRST_NAME);
        person.setLastname(LAST_NAME);
    }

    @Test
    public void shouldHaveCorrectName() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(person.getFirstname())
                .overridingErrorMessage("Expected the first name to be: %s but it was: %s",
                        FIRST_NAME, person.getFirstname())
                .isEqualTo(FIRST_NAME);

        softAssertions.assertThat(person.getLastname())
                .overridingErrorMessage(
                        "Expected the last name to be: %s but it was: %s",
                        LAST_NAME,
                        person.getLastname())
                .isEqualTo(LAST_NAME);
        softAssertions.assertAll();
    }

}
