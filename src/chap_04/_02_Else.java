package chap_04;

public class _02_Else {
    public static void main(String[] args) {
        //조건문 If else
        int hour = 15;
        if(hour < 10) {
            System.out.println("커피 + 1");
        }
        else{
            System.out.println("디카페인 + 1");
        }
        System.out.println("주문 완료 # 1");

        hour = 15;
        boolean coffee = true;
        if(hour > 14 || coffee) {
            System.out.println("디카페인 + 1");
        }
        else{
            System.out.println("커피 + 1");
        }
    }
}
