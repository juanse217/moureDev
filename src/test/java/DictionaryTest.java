import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Set;

import com.sebasmoure.moureLogic.Diccionario;

public class DictionaryTest {

    @Test
    public void dictionary_entries_returnsEntries() {
        HashMap<String, String> map = Diccionario.dictionary();
        Set<String> actualKeys = map.keySet();
        Set<String> expectedKeys = Set.of("name", "age", "birthDate", "programmingLanguages");
        assertEquals(expectedKeys, actualKeys);

    }

    @Test
    public void dictionary_values_returnsEntries() {
        HashMap<String, String> map = Diccionario.dictionary();
        ArrayList<String> actualValues = new ArrayList<>();

        for (String value : map.values()) {
            actualValues.add(value);
        }
        
        ArrayList<String> expectedValues = new ArrayList<>();
        expectedValues.add("Java, python");
        expectedValues.add("Sebastian");
        expectedValues.add("8 septiembre");
        expectedValues.add("20");

        assertEquals(expectedValues, actualValues);
    }

}
