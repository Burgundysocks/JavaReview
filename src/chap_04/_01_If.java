package chap_04;

public class _01_If {
    public static void main(String[] args) {
        //조건문 if
        int hour = 10;

        if (hour < 14) {
            System.out.println("커피 + 1");
            System.out.println("커피를 마셔도 됩니다.");
        }


        //오후 2시 이전이면서 안마셧ㅇ르때
        hour = 10;
        boolean coffee = false;

        //if (hour < 14 && coffee == false){
        if (hour < 14 && !coffee){
            System.out.println("커피 + 1");
            System.out.println("커피를 마셔도 됩니다.");
        }


    }
}
