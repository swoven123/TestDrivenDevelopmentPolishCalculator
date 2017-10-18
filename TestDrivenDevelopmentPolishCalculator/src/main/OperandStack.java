import java.math.BigDecimal;
import java.util.Stack;

/**
 * Created by swoven on 10/9/17.
 */
public class OperandStack {

    Stack<BigDecimal> values=new Stack<>();

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
