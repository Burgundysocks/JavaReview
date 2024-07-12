package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        //아스키코드 - 미국 표준 코드
        char c = 'A'; //알파벳 대문자는 65, 소문자는 97, 숫자(0)은 48부터 시작
        System.out.println(c); //A
        System.out.println((int)c); //65

        c = 'B';
        System.out.println(c); //B
        System.out.println((int)c); //66

        c++;
        System.out.println(c); //C
        System.out.println((int)c); //67

        c = '0';
        System.out.println(c); // 0
        System.out.println((int)c); //48

        c++;
        System.out.println(c); //1
        System.out.println((int)c); //49


    }
}
