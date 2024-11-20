import java.util.ArrayList;
import java.util.Scanner;

// 지식의 파편화는 어느 순간 팍! 하고 연결된다

public class DataHandler {
    ArrayList <Integer> eachList = new ArrayList<Integer>();

    public void saveData(int result) {
        eachList.add(result);
        // 저장된 거다...이걸 그렇게 헤맸구나.......................
        // main에 바로 작성하면 정확한 기능/역할을 알기 어려워서 class로 쓰는 게 좋다
        // 메서드는 동사형으로 먼저 쓴다
        // dataSave -> saveData (자바 컨벤션)
        // 자바 컨벤션 많이 고민해서 최대한 반영하자!
    }
    public void deleteFirstData() {
        eachList.remove(0);
        System.out.println("맨 처음에 저장된 값이 삭제되었습니다.");
        //어차피 arrayList라는 멤버변수를 메인에 있는 dataHandler가 계속 들고 있으니까, 지우고 남은 건 그대로 들고 있으니까, 굳이 반환할 필요가 있나?
    }
    public String wannaDelete() {
        // 지울래 말래?
        // void면 반환 없이 sout
        // return String이면, result 숫자처럼....?
        Scanner sc = new Scanner(System.in);
        String yesOrNo = sc.nextLine();
        if (yesOrNo.equals("지울래요.")) {
            // 지우고 싶어... 그러면 지우는 기능을 누가 가지고 있니...
            // 내부에서 어떻게 부르냐...firstDataDelete를....
            deleteFirstData(); // 같은 클래스에 정의된 메서드는 그냥 부르면 된다........부르기 너무 힘들다....
            return "지웠어요. 이제 그만...";
            // "큰따옴표" 이걸로 쓰는 거 맞나...? 이랬다..
        } else {
            return "알겠습니다. 마음 바꾸지 말아주세요...";
        }
    }
}