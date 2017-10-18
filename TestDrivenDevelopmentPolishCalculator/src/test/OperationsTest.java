import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by swoven on 10/16/17.
 */
public class OperationsTest {

    private Calculator calculator;

    @Before
    public void createCalculatorWithTwoValues(){
        calculator=new Calculator();
        calculator.setAccumulator(new BigDecimal(40));
        calculator.enter();
        calculator.setAccumulator(new BigDecimal(4));
    }

    @Test
    public void testAddExecution(){
        calculator.execute("+");
        assertEquals(new BigDecimal(44), calculator.getAccumulator());
    }

    @Test
    public void testSubtractExecution(){
        calculator.execute("-");
        assertEquals(new BigDecimal(36), calculator.getAccumulator());
    }

    @Test
    public void testMultiplication(){
        calculator.execute("*");
        assertEquals(new BigDecimal(160), calculator.getAccumulator());
    }

    @Test
    public void testDivideOperation(){
        calculator.execute("/");
        assertEquals(new BigDecimal(10), calculator.getAccumulator());
    }

    @Test
    public void testSquareOperation(){
        calculator.execute("^");
        assertEquals(new BigDecimal(16), calculator.getAccumulator());
    }
}
