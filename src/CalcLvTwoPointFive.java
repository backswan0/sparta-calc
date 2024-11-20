public class CalcLvTwoPointFive {
    public static void main(String[] args) {

        boolean flag = true;
        while (flag) {
            System.out.print("0 이상인 첫 번째 정수를 한 개 입력해 주세요: ");

            Num first = new Num();
            System.out.println(first.inputNum);

            Op op = new Op();

            System.out.print("0 이상인 두 번째 정수를 한 개 입력해 주세요: ");
            Num second = new Num();
            System.out.println();

            Calculation calculation = new Calculation();

            int result = calculation.calculate(first, op, second);
            // 실제로 함수를 사용하는 것 == 함수를 호출

            System.out.println(result);

            DataHandler dataHandler = new DataHandler();
            // 기능을 만들기 전에 메인에서 만들어라.....
            // 어떤 요청을 하고 싶은지도 적어보자.....
            // 저장....삭제.....
            // result 값을 저장하고 싶다...
            // 저장 메서드 먼저 만들자...
            dataHandler.saveData(result);
            // dataHandler 객체를 만들었음.
            // DataHandler 클래스에 ArrayList가 멤버변수로 있음
            // 저거 안 지우는 이상 남아 있다......
            // void로 해도 상관 없는 이유.......
            // dataHandler.firstDataDelete();
            // 얘를 지우고 바꿔보자.... 내부에서만 가동하도록.....

            System.out.print("지우고 싶으시면 '지울래요.'를 적어주세요.: ");
            dataHandler.wannaDelete();

            System.out.println(dataHandler.wannaDelete());
            // 밑에 두 줄을...한 줄로...해야 해요?????????????????????????????
            // String deleteResult = dataHandler.wannaDelete();
            // System.out.println(deleteResult);

            Ending ending = new Ending();
            flag = ending.exitsProgram();
        }
    }
}