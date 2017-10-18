import java.math.BigDecimal;

/**
 * Created by swoven on 10/16/17.
 */
public abstract class BinaryOperation implements Operations {

    @Override
    public void apply(OperandStack values) {
        BigDecimal valueOne=values.peek();
        values.pop();
        BigDecimal valueTwo=values.peek();
        values.replaceTop(calculate(valueOne, valueTwo));
    }

    public abstract BigDecimal calculate(BigDecimal valueOne, BigDecimal valueTwo);

}
