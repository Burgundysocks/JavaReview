package chap_04;

public class Quiz4 {
    public static void main(String[] args) {
        int hour = 5;
        boolean smallCar = false;

        int total = 4000 * hour;

        if(total > 30000){
            System.out.println("30000원");
        }else{
            System.out.println(total + "원");
        }

        if(smallCar){
            total = total / 2;
            System.out.println(total + "원");
        }
    }
}
