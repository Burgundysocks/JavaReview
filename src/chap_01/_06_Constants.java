package chap_01;

public class _06_Constants {
    //상수 //상수는 전부 대문자로 적기 때문에 띄어쓰기가 있다면 _로 구분
    public static void main(String[] args) {
        final String KR_COUNTRY_CODE = "+82";// final을 붙이면 바꿀 수 없음
        //KR_COUNTRY_CODE = "+8282";//불가능
        System.out.println(KR_COUNTRY_CODE);

        final double PI = 3.141592;
        System.out.println(PI);



    }
}
