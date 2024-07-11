package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        //Continue

        int max = 20;
        int count = 0;
        int noCount = 17;
        for (int i = 1; i <=50 ; i++) {
            System.out.println(i);
            if(i == noCount){
                System.out.println(i+"번 패스!");
                continue;
            }

            count ++;
            if (count == max) {
                System.out.println("끝!");
                break;
            }
        }
    }
}
