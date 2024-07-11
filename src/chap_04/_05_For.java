package chap_04;

public class _05_For {
    public static void main(String[] args) {
        //반복문
        for(int i = 0; i < 10; i++) {
            System.out.println("안녕하세요 나코입니다" + i);
        }

        System.out.println("10보다 작은 수들만 출력할 때");
        //짝수만 출력
        for(int i = 0; i < 10; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("-----");
        //홀수만
        for(int i = 0; i < 10; i++) {
            if(i % 2 == 1) {
                System.out.println(i);
            }
        }
        System.out.println("-----");
        //5,4,3,2,1
        for(int i = 5; i > 0 ; i--) {
            System.out.println(i);
        }
        System.out.println("-----");
        //짝수 내림차
        for(int i = 10; i > 0; i--) {
            if(i % 2 == 0) {
                System.out.println(i-2);
            }
        }
        System.out.println("-----");
        //홀수 내림차
        for(int i = 10; i > 0; i--) {
            if(i % 2 == 1) {
                System.out.println(i);
            }
        }

        System.out.println("---1부터 10까지 합---");
        int sum = 0;
        for(int i = 0; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);

    }
}
