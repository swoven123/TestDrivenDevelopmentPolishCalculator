import java.math.BigDecimal;

/**
 * @author Swoven Pokharel
 * @ since 10/16/17.
 */
public class AddOperation extends BinaryOperation{
    @Override
    public BigDecimal calculate(BigDecimal valueOne, BigDecimal valueTwo) {
        return valueOne.add(valueTwo);
    }
}
