import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * @author swoven
 * @since 10/1/17.
 */
public class NewCalculatorTest {

    private Calculator calculator;

    @Before
    public void createCalculator(){
        calculator=new Calculator();
    }

    @Test
    public void testNewCalculatorHasAccumulatorOfZero(){
        assertEquals(BigDecimal.ZERO, calculator.getAccumulator());

    }

    @Test
    public void testSettingAccumulatorValue(){
        BigDecimal bigDecimal=new BigDecimal(12);
        calculator.setAccumulator(bigDecimal);
        assertEquals(bigDecimal, calculator.getAccumulator());
    }

}
