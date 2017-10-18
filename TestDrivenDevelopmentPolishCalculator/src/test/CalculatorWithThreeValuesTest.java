import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * @author swoven
 * @since 10/9/17.
 */
public class CalculatorWithThreeValuesTest {

    private Calculator calculator;
    private BigDecimal value1;
    private BigDecimal value2;
    private BigDecimal value3;

    @Before
    public void setUp(){
        calculator=new Calculator();
        value1=new BigDecimal(99);
        value2=new BigDecimal(100);
        value3=new BigDecimal(101);

        calculator.setAccumulator(value1);
        calculator.enter();
        calculator.setAccumulator(value2);
        calculator.enter();
        calculator.setAccumulator(value3);
    }

    @Test
    public void testingAccumulatorAfterPushingThreeValues(){
        assertEquals(value3,calculator.getAccumulator());
    }

    @Test
    public void testingAccumulatorAfterDroppingSingleValue(){
        calculator.drop();
        assertEquals(value2,calculator.getAccumulator());
    }

    @Test
    public void testingAccumulatorAfterDroppingTwoValues(){
        calculator.drop();
        calculator.drop();
        assertEquals(value1, calculator.getAccumulator());
    }
}
