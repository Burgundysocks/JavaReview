package chap_01;

import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bus = sc.next();
        int time = sc.nextInt();
        double distance = sc.nextDouble();

        System.out.println(bus + "번 버스");
        System.out.println("약 " + time+ "분 후 도착");
        System.out.println("남은 거리 : " + distance+"km");

    }


}
