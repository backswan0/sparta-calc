import java.util.Scanner;

public class CalcLvOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("0 이상인 첫 번째 정수를 한 개 입력해 주세요: ");
            int numOne = sc.nextInt();
            System.out.print("0 이상인 두 번째 정수를 한 개 입력해 주세요: ");
            int numTwo = sc.nextInt();
            sc.nextLine();
            System.out.print("+, -, *, / 기호 중 하나를 골라서 입력해 주세요: ");
            String operator = sc.nextLine();

            if (operator.equals("+")) {
                System.out.println(numOne + " 더하기 " + numTwo + " 결과는 " + (numOne + numTwo) + "입니다.");
            } else if (operator.equals("-")) {
                System.out.println(numOne + " 빼기 " + numTwo + " 결과는 " + (numOne - numTwo) + "입니다.");
            } else if (operator.equals("*")) {
                System.out.println(numOne + " 곱하기 " + numTwo + " 결과는 " + (numOne * numTwo) + "입니다.");
            } else if (operator.equals("/")) {
                if (numTwo == 0) {
                    System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0은 올 수 없습니다.");
                } else {
                    System.out.println(numOne + " 나누기 " + numTwo + " 결과는 " + ((double) numOne / numTwo) + "입니다.");
                }
            } else {
                System.out.println("부호를 잘못 입력하였습니다.");
                System.out.println("확인 후 다시 입력해 주세요.");
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
            }
            System.out.print("프로그램을 종료하시겠습니까? 종료를 원하시면 exit을 입력해 주세요: ");
            String question = sc.next();
            if (question.equals("exit")) {
                System.out.println("네, 알겠습니다. 프로그램을 종료합니다.");
                break;
            }
        }
    }
}
