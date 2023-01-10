import org.example.PetEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DisplayName("Pass the param value by value source")
public class ParamTest {

    @ParameterizedTest(name = "{index} => message=''{0}''")
    @ValueSource(strings = {"Hello", "World"})
    public void paramTest(String msg) {
        assertNotNull(msg);
    }

    @DisplayName("Pass not null param of PetEnum")
    @ParameterizedTest(name = "{index} -> pet=''{0}''")
    @EnumSource(PetEnum.class)
    public void EnumTest(PetEnum pet) {
        assertNotNull(pet);
    }

    @DisplayName("Pass not null param of PetEnum")
    @ParameterizedTest(name = "{index} -> pet=''{0}''")
    @EnumSource(value = PetEnum.class, names = {"CAT"})
    public void EnumTestWithOnlyCat(PetEnum pet) {
        assertNotNull(pet);
    }


    @DisplayName("CSV format test")
    @ParameterizedTest(name = "{index} => a={0}, b={1}, sum={2}")
    @CsvSource({
            "1, 2, 3",
            "4, 3, 7"
    })
    public void sum(int a, int b, int sum) {
        assertEquals(sum, a + b);
    }

    @DisplayName("Csv format test from a source file")
    @ParameterizedTest(name = "{index} => a={0}, b={1}, sum{2}")
    @CsvFileSource(resources = "test-data.csv")
    public void sumFromCSVFile(int a, int b, int sum) {
        assertEquals(sum, a + b);
    }

    @DisplayName("the source are from a static factory method")
    @ParameterizedTest(name = "{index} => a={0}, b={1}, sum{2}")
    @MethodSource("sumProvider")
    public void sumFromFactory(int a, int b, int sum){
        assertEquals(sum, a + b);
    }

    private static Stream<Arguments> sumProvider() {
        return Stream.of(
                Arguments.of(1,2,3),
                Arguments.of(3,2,5)
        );
    }


    @DisplayName("Use the source from static class impelements ArgumentsProvider")
    @ParameterizedTest(name = "{index} => a{0}, b{1}, sum{2}")
    @ArgumentsSource(CustomArgumentProvider.class)
    public void sumFromArgumentProvider(int a, int b, int sum) {
        assertEquals(sum, a + b);
    }

    // usually don't add a class here, but this is an example
    static class CustomArgumentProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
            return Stream.of(
                    Arguments.of(1, 2, 3),
                    Arguments.of(3, 3, 6)
            );
        }
    }
}
