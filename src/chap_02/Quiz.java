package chap_02;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        String result = (a > 120) ? a + "이므로 탑승 가능합니다" : a + "이므로 탑승 불가합니다.";
        System.out.println(result);
    }
}
