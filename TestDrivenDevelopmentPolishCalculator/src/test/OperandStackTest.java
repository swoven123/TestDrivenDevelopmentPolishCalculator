import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * @author swoven
 * @since 10/9/17.
 */
public class OperandStackTest {

    private OperandStack operandStack;

    @Before
    public void setUpOperandStackTest(){
        operandStack=new OperandStack();
    }

    @Test
    public void testNewOperandStackTestReturnsZero(){
        assertEquals(BigDecimal.ZERO, operandStack.peek());
    }

    @Test
    public void testPushingValueOnStack(){
        BigDecimal bigDecimal=new BigDecimal(12);
        operandStack.push(bigDecimal);
        assertEquals(bigDecimal, operandStack.peek());
    }

    @Test
    public void testReplacingTopOfTheStack(){
        BigDecimal bigDecimal=new BigDecimal(333);
        operandStack.replaceTop(bigDecimal);
        assertEquals(bigDecimal, operandStack.peek());
    }

    @Test
    public void testPoppingValuesFromTheStack(){
        BigDecimal valOne=new BigDecimal(3333);
        operandStack.push(valOne);
        operandStack.push(new BigDecimal(111));
        operandStack.pop();
        assertEquals(valOne,operandStack.peek());
    }

    @Test
    public void testPopOnEmptyStack(){
        operandStack.pop();
        assertEquals(BigDecimal.ZERO, operandStack.peek());
    }



}
