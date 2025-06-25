import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.sebasmoure.moureLogic.SumaUnitarias;

public class SumaUnitariasTest {
    /*
     * EJERCICIO:
     * Crea una función que se encargue de sumar dos números y retornar
     * su resultado.
     * Crea un test, utilizando las herramientas de tu lenguaje, que sea
     * capaz de determinar si esa función se ejecuta correctamente.
     */
    @Test
    public void addingNumbers_xPlusx_returnsAddition(){
        final int expected = 4;
        final int actualReturn = SumaUnitarias.addNumbers(2, 2);
        assertEquals(expected, actualReturn);
    } 
}
