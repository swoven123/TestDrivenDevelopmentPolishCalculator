import java.math.BigDecimal;

/**
 * @author swoven
 * @since 10/16/17.
 */
public class DivideOperation extends BinaryOperation{

    @Override
    public BigDecimal calculate(BigDecimal valueOne, BigDecimal valueTwo) {
        return valueTwo.divide(valueOne);
    }
}
