import java.util.Scanner;

public class Ending {
    public boolean exitsProgram() {
        System.out.println("프로그램을 종료하시겠습니까? 종료를 원하시면 exit을 입력해 주세요.");
        Scanner sc = new Scanner(System.in);
        String question = sc.nextLine();
        if (question.equals("exit")) {
            System.out.println("네, 알겠습니다. 프로그램을 종료합니다.");
            return false;
        } return true;
    }
}