import java.math.BigDecimal;

/**
 * Created by swoven on 10/16/17.
 */
public class AddOperation extends BinaryOperation{


    @Override
    public BigDecimal calculate(BigDecimal valueOne, BigDecimal valueTwo) {
        return valueOne.add(valueTwo);
    }
}
