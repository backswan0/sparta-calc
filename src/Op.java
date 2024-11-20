import java.util.Scanner;

public class Op {
        String inputOp;

        public Op() {
            Scanner sc = new Scanner(System.in);
            System.out.print("+, -, *, /, % 중 원하는 부호를 골라 입력해주세요: ");
            inputOp = sc.nextLine();
        }
    }