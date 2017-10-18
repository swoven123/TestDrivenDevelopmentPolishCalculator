import java.math.BigDecimal;

/**
 * Created by swoven on 10/16/17.
 */
public class SquareOperation implements Operations {

    @Override
    public void apply(OperandStack stack) {
        BigDecimal value=stack.peek();
        stack.replaceTop(value.pow(2));
    }
}
