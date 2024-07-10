package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s.length()); //29

        //대문자 변환
        System.out.println(s.toUpperCase()); //I LIKE JAVA AND PYTHON AND C.

        //소문자 변환
        System.out.println(s.toLowerCase()); //i like java and python and c.

        //포함 관계
        System.out.println(s.contains("Java")); //포함되서 trueㄷ
        System.out.println(s.indexOf("Java")); //위치 정보 -> 7
        System.out.println(s.indexOf("C#")); //위치하지 않는다면 -> -1
        System.out.println(s.indexOf("and")); //처음 일치하는 위치정보(12)
        System.out.println(s.lastIndexOf("and")); //마지막 위치정보(23)
        System.out.println(s.startsWith("I like"));//이 문자열로 시작하면 true
        System.out.println(s.endsWith("."));//이 문나열로 끝나면 true






    }
}
