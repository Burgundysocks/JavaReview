package chap_06;

public class _08_MainMethod {
    public static void main(String[] args) {
        //문자열을 여러개 갖고 잇는 string 배려을 갖고 잇는 메소드이다

        if(args.length == 1) {
            switch (args[0]) {
                case "1":
                    System.out.println("1");
                    break;
                case "2":
                    System.out.println("2");
                    break;
                case "3":
                    System.out.println("3");
                    break;
                default:
                    System.out.println("잘못입력");
            }
        }
    }
}
