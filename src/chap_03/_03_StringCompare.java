package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2));//false

        System.out.println(s1.equals("Java")); //true

        System.out.println(s1.equalsIgnoreCase("java")); //true 대소문자 구분 x


        // 문자열 비교 2
        s1 = "1234";
        s2 = "1234";
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1 == s2); //true
    }
}
