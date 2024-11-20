public class Calculation {

    // 이 자료형으로 객체를 받을 거야
    public int calculate(Num one, Op op, Num two) {
        // (int one, String op, int two)으로 하면 덜 헷갈렸을 듯...
        if (op.inputOp.equals("+")) {
            return one.inputNum + two.inputNum;
        } else if (op.inputOp.equals("-")) {
            return one.inputNum - two.inputNum;
        } else if (op.inputOp.equals("*")) {
            return one.inputNum * two.inputNum;
        } else if (op.inputOp.equals("/")) {
            return one.inputNum / two.inputNum;
        } else if (op.inputOp.equals("%")) {
            return one.inputNum % two.inputNum;
        } else {
            return 0;
        }
    }
}
