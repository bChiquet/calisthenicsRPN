public class Operation implements Operand {

    private final Operator operator;
    private final Operands operands;

    Operation(Operator operator, Operands operands) {
        this.operator = operator;
        this.operands = operands;
    }

    public Value eval() {
        return operator.apply(operands.getFirstOperand(), operands.getSecondOperand());
    }
}
