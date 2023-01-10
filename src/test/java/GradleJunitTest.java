import org.junit.jupiter.api.*;

@DisplayName("Gradle JUnit5 test example")
public class GradleJunitTest {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before all");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Before each");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("After each");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After all");
    }

    @Test
    @DisplayName("First test")
    public void firstTest() {
        System.out.println("This is first test");
    }

    @Test
    @DisplayName("2nd test")
    public void secondTest() {
        System.out.println("This is 2nd test");
    }


    @DisplayName("Test method for class A")
    @Nested
    class A {

        @BeforeEach
        public void beforeEach() {
            System.out.println("In nested, before each");
        }

        @AfterEach
        public void afterEach() {
            System.out.println("In nested, after each");
        }

        @DisplayName("A nested class with a test")
        @Test
        public void NestedTest() {
            System.out.println("A nested test");
        }

        @Nested
        @DisplayName("When X is true")
        class WhenX {

            @BeforeEach
            void beforeEach() {
                System.out.println("Before each test method of the WhenX class");
            }

            @AfterEach
            void afterEach() {
                System.out.println("After each test method of the WhenX class");
            }

            @Test
            @DisplayName("Example test for method A when X is true")
            void sampleTestForMethodAWhenX() {
                System.out.println("Example test for method A when X is true");
            }
        }
    }
}
