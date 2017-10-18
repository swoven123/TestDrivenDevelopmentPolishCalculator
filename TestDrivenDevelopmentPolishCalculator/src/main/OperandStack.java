import java.math.BigDecimal;
import java.util.Stack;

/**
 * @author swoven
 * @since 10/9/17.
 */
class OperandStack {

    private final Stack<BigDecimal> values=new Stack<>();

    public BigDecimal peek() {
        if(values.isEmpty())
            return BigDecimal.ZERO;
        return values.peek();
    }

    public void push(BigDecimal bigDecimal) {
        values.push(bigDecimal);
    }

    public void replaceTop(BigDecimal bigDecimal) {
        pop();
        values.push(bigDecimal);
    }

    public void pop() {
        if(values.size()>0)
        values.pop();
    }
}
