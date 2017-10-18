import java.math.BigDecimal;

/**
 * @author  swoven
 * @since 10/16/17.
 */
public abstract class BinaryOperation implements Operations {

    @Override
    public void apply(OperandStack values) {
        BigDecimal valueOne=values.peek();
        values.pop();
        BigDecimal valueTwo=values.peek();
        values.replaceTop(calculate(valueOne, valueTwo));
    }

    protected abstract BigDecimal calculate(BigDecimal valueOne, BigDecimal valueTwo);

}
