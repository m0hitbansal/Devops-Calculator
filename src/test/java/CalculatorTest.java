import calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void addingTruePositive(){
        assertEquals("Adding two numbers ", 50, calculator.add(47, 3), DELTA);
    }

    @Test
    public void addingFalsePositive(){
        assertNotEquals("Adding two  numbers ", 40.3, calculator.add(38.1, 28.2), DELTA);
    }

    @Test
    public void subtractingTruePositive(){
        assertEquals("Subtracting two r numbers ", 28, calculator.subtract(78, 50), DELTA);
      
    }

    @Test
    public void multiplyingTruePositive(){
        assertEquals("Multiplying twor numbers ", 120, calculator.multiply(12, 10), DELTA);
        
    }

    @Test
    public void multiplyingFalsePositive(){
        assertNotEquals("Multiplying two  numbers ", 8, calculator.multiply(2, 2), DELTA);
       
    }

    @Test
    public void dividingTruePositive(){
        assertEquals("Dividing two  numbers ", 10, calculator.divide(100, 10), DELTA);
        assertEquals("Dividing two  numbers ", Double.NaN, calculator.divide(0, 0), DELTA);
       
    }

    @Test
    public void dividingFalsePositive(){
        assertNotEquals("Dividing two  numbers", 1, calculator.divide(2.3, 1.3), DELTA);
        
    }


}
