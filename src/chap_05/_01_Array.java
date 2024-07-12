package chap_05;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class _01_Array {
    public static void main(String[] args) {
        //배열: 같은 자료형의 값 여러개를 저장하는 연속된 공간
        String coffee1 = "아메리카노";
        String coffee2 = "모카";
        String coffee3 = "라떼";
        String coffee4 = "카푸치노";

        System.out.println(coffee1+"하나");
        System.out.println(coffee2+"하나");
        System.out.println(coffee3+"하나");
        System.out.println(coffee4+"하나");
        System.out.println();

        //배열선언 첫번째 방법
        String[] coffees = new String[4];
        coffees[0] = coffee1;
        coffees[1] = coffee2;
        coffees[2] = coffee3;
        coffees[3] = coffee4;


        String coffees2[] = new String[4];
        coffees2[0] = coffee1;
        coffees2[1] = coffee2;
        coffees2[2] = coffee3;
        coffees2[3] = coffee4;

        String[] coffees3 = new String[]{coffee1, coffee2, coffee3,coffee4};
        String[] coffees3_1 = new String[]{"아메리카노", "모카", "라떼", "카푸치노"};
        String[] coffees3_2 = {"아메리카노", "모카", "라떼", "카푸치노"};

        List<String>coffees4 = new ArrayList<String>();
        coffees4.add(coffee1);
        coffees4.add(coffee2);
        coffees4.add(coffee3);
        coffees4.add(coffee4);

    }
}
