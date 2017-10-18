import java.math.BigDecimal;

/**
 * Created by swoven on 10/1/17.
 */
public class Calculator {
    private OperandStack values=new OperandStack();

    public BigDecimal getAccumulator() {
        return values.peek();
    }

    public void setAccumulator(BigDecimal value) {
        values.replaceTop(value);
    }

    public void enter() {
        values.push(getAccumulator());
    }

    public void drop() {
        values.pop();
    }

    public void execute(String operand) {

        Operations operations=null;

        if(operand.equals("+"))
            operations=new AddOperation();
        else if(operand.equals("-"))
            operations=new SubtractOperation();
        else if(operand.equals("*"))
            operations=new MultiplyOperation();
        else if(operand.equals("/"))
            operations=new DivideOperation();
        else if(operand.equals("^"))
            operations=new SquareOperation();

        operations.apply(values);
    }

}
