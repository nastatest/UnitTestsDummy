import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTests {

    @Test

    public void addTest() {
        Calculator calculator = new Calculator();
        assertEquals("The result is not correct!", 82, calculator.add(25, 57));
    }

    @Test

    public void subtractTest() {
        Calculator calculator = new Calculator();
        assertEquals("The result is not correct!", 48, calculator.subtract(90, 42));
    }

    @Test

    public void multiplyTest() {
        Calculator calculator = new Calculator();
        assertEquals("The result is not correct!", 78, calculator.multiply(6, 13));
    }

    @Test

    public void divideTest() {
        Calculator calculator = new Calculator();
        assertEquals("The result is not correct!", 5, calculator.divide(25, 5));
    }
}
