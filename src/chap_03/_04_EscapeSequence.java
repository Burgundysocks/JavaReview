package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        //특수문자, 이스케이프 문자(Escape Sequence, Escape Character, Special Character)
        // \n \t \\ \" \'
        //3개의 문장 출력

        //\n 줄바꿈
        System.out.println("자바가\n너무\n재미있어요.");
        //자바가
        //너무
        //재미있어요.

        System.out.println("연필\t1000원");//연필	1000원
        System.out.println("지우개\t2000원");//지우개	2000원
        System.out.println("과자\t3000원");//과자	3000원

        System.out.println("C:\\Program Files\\Java\\chap_03\\04_EscapeSequence.java");
        //C:\Program Files\Java\chap_03\04_EscapeSequence.java

        System.out.println("고양이가 \"야옹\"이라고 했어요");
        //고양이가 "야옹"이라고 했어요




    }
}
