import java.util.Scanner;

public class CalcLvTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculation = new Calculator();
        while (true) {
            System.out.print("0 이상인 첫 번째 정수를 입력해 주세요: ");
            int numFirst = sc.nextInt();

            System.out.print("사칙연산 기호(+, -, *, /) 중 하나를 입력해 주세요: ");
            String operator = sc.next();

            System.out.print("0 이상인 두 번째 정수를 입력해 주세요: ");
            int numSecond = sc.nextInt();

            int result = calculation.calculate(numFirst, operator, numSecond);

            if (result == Integer.MIN_VALUE) {
                System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0은 올 수 없습니다.");
            } else {
                calculation.saveResults(result);
                String outcome = Integer.toString(result);
                System.out.println("연산한 결과는 " + outcome + "입니다.");
            }
            System.out.println("결괏값은 다음과 같이 저장되었습니다: "+calculation.getResults());
            System.out.print("가장 먼저 저장된 결괏값을 삭제하시겠습니까? 삭제를 원하시면 yes를 입력해 주세요: ");
            String yes = sc.next();
            if (yes.equals("yes")) {
                System.out.println("예, 알겠습니다. 가장 먼저 저장된 결괏값을 삭제합니다.");
                calculation.removeFirstResult();
                System.out.println("삭제 후 결괏값은 다음과 같이 조회됩니다: "+calculation.getResults());
            }
            System.out.print("프로그램을 종료하시겠습니까? 종료를 원하시면 exit을 입력해 주세요: ");
            String exit = sc.next();
            if (exit.equals("exit")) {
                System.out.println("예, 알겠습니다. 프로그램을 종료합니다.");
                break;
            }
        }
    }
}

