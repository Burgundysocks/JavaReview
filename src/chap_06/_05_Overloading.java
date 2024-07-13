package chap_06;

public class _05_Overloading {
    public static int power(int number){
        int result = number * number;
        return result;
    }
    public static int power(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *=number;
        }
        return result;
    }


    public static void main(String[] args) {
        //오버로딩 - 같은 이름의 메소드를 만들어도 매개변수가 다르게 만드는 것은 가능
        int a = power(3);
        int b = power(2, 3);

    }
}
