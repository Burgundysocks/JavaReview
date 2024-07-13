package chap_06;

public class _06_WhenToUse {
    public static int getPower(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        //메소드가 필요한 이유
        int result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 2;
        }

        result = 1;
        for (int i = 0; i < 3; i++) {
            result *= 3;
        }
        //이렇게 여러개 만들면 불편함

        System.out.println(getPower(2,3));
        System.out.println(getPower(3,3));
    }
}
