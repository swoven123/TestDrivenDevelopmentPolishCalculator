import java.math.BigDecimal;

/**
 * Created by swoven on 10/16/17.
 */
public class DivideOperation extends BinaryOperation{

    @Override
    public BigDecimal calculate(BigDecimal valueOne, BigDecimal valueTwo) {
        return valueTwo.divide(valueOne);
    }
}
