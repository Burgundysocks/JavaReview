package chap_04;

public class _06_While {
    public static void main(String[] args) {
        //반복문 while
        int distance = 25;
        int move = 0;
//        while (distance > move) {
//            distance--;
//            System.out.println(distance);
//        }

        while(move < distance){
            System.out.println("계속이동");
            System.out.println("이동거리 : "+ move);
            move += 3;

        }
        System.out.println("도착");
    }
}
