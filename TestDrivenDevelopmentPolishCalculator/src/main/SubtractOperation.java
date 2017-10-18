import java.math.BigDecimal;

/**
 * Created by swoven on 10/16/17.
 */
public class SubtractOperation extends BinaryOperation{

    @Override
    public BigDecimal calculate(BigDecimal valueOne, BigDecimal valueTwo) {
        return valueTwo.subtract(valueOne);
    }
}
