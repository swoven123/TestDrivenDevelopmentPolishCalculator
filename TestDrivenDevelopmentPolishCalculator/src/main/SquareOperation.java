import java.math.BigDecimal;

/**
 * @author swoven
 * @since 10/16/17.
 */
public class SquareOperation implements Operations {

    @Override
    public void apply(OperandStack stack) {
        BigDecimal value=stack.peek();
        stack.replaceTop(value.pow(2));
    }
}
