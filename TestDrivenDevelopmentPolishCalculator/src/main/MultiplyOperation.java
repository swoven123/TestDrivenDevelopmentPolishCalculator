import java.math.BigDecimal;

/**
 * @author  swoven
 * @since 10/16/17.
 */
public class MultiplyOperation extends BinaryOperation {

    @Override
    public BigDecimal calculate(BigDecimal valueOne, BigDecimal valueTwo) {
        return valueOne.multiply(valueTwo);
    }
}
