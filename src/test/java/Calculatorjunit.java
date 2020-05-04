import org.junit.Assert;
import org.junit.Test;
public class Calculatorjunit {
    Calculator calculator = null;
  @Test
    public void add() {
        calculator = new Calculator();
        int a = 60;
        int b = 15;
        int out = 75;
        int ans = calculator.add(a,b);
        Assert.assertEquals(out,ans);
    }

}
