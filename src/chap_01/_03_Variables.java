package chap_01;

public class _03_Variables {
    //변수
    public static void main(String[] args) {
        String name = "상현";
        int time = 15;
        System.out.println(name + "님 배송이 "+ time +"시에 시작되었습니다");

        double score = 90.5;
        char grade = 'A';
        System.out.println(name + "님의 평균 점수는 "+score+ "점이고 " + grade+"학점입니다.");


        boolean pass = true;
        System.out.println("이번 시험 합격 여부 " + pass);

        double a = 3.14;
        float b = 3.14f;

        double d = 3.14123456789;
        float f = 3.14123456789f;
        System.out.println(d); //3.14123456789
        System.out.println(f); //3.1412346

//        int i = 100000000000000; 수용불가능
        Long i = 100000000000000L;

    }
}
