import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class fahrenheitTest {

    @Test
    public void testFahrenheitToCelsius() {
        TemperatureConverter1 converter = new TemperatureConverter1();
        assertEquals(0, converter.fahrenheitToCelsius(32), 0.001);
    }

    @Test
    public void testCelsiusToFahrenheit() {
        TemperatureConverter1 converter = new TemperatureConverter1();
        assertEquals(32, converter.celsiusToFahrenheit(0), 0.001);
    }

    @Test
    public void testIsExtremeTemperature() {
        TemperatureConverter1 converter = new TemperatureConverter1();
        assertTrue(converter.isExtremeTemperature(-50));
        assertTrue(converter.isExtremeTemperature(60));
        assertFalse(converter.isExtremeTemperature(0));
    }
}
