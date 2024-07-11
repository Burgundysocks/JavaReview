package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        //Switch Case
        //1등 전액 2등 반액 3등 반액 그외 x

        int rank = 3;
        switch (rank) {
            case 1:
                System.out.println("전액장학금");
                break;
            case 2:
//                System.out.println("반액장학금");
//                break;
            case 3:
                System.out.println("반액장학금");
                break;
            default:
                System.out.println("장학대상아님");
                break;
        }
    }
}
