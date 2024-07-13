package chap_06;

public class _07_VariableScope {
    public static void methodA(){

    }

    public static void methodB(){
        int result =1;//지역변수
    }
    public static void main(String[] args) {
        int number = 3;

//        System.out.println(result);
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
//        System.out.println(i);//for문 밖에서 사용 불가

        {
            int j = 0;
            System.out.println(j);
        }
//        System.out.println(j);//불가
    }
}
