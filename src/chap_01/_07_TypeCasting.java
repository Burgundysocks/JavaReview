package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        //형변환 TypeCasting
        // 정수형 -> 실수형
        //실수형 -> 정수형

        int score = 93;
        System.out.println(score + 98.8);
        System.out.println((double) score);

        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int)score_f);
        System.out.println((int)score_d);

        score = 93 + (int)98.8;
        System.out.println(score); //191

        score_d = 93 + 98.8;
        System.out.println(score_d);

        //변수에 형변환 데이터 집어넣기
        double convertedScoreD = score;
        System.out.println(convertedScoreD);

        int convertedScore = (int)score_d;
        System.out.println(convertedScore);


        //숫자를 문자열로 변환
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1+1); //931

        String s2 = String.valueOf(98);
        s2 = Double.toString(98);
        System.out.println(s2);

        //문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);
        double d = Double.parseDouble("98.8");
        System.out.println(d);


    }
}
