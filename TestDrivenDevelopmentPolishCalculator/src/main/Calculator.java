import java.math.BigDecimal;

/**
 * @author swoven
 * @since 10/1/17.
 */
class Calculator {
    private final OperandStack values=new OperandStack();

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

        Operations operations;

        switch(operand){
            case "+":
                operations=new AddOperation();
                break;
            case "-":
                operations=new SubtractOperation();
                break;
            case "*":
                operations=new MultiplyOperation();
                break;
            case "/":
                operations=new DivideOperation();
                break;
            case "^":
                operations=new SquareOperation();
                break;
            default:
                operations=new AddOperation();
        }
        operations.apply(values);
    }

}
