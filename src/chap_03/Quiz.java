package chap_03;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        System.out.println(a.substring(0,8));
        System.out.println(a.substring(0,a.indexOf("-")+2));

    }
}
