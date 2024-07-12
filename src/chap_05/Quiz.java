package chap_05;

public class Quiz {
    public static void main(String[] args) {
        int [] shoe = new int [10];
        for (int i = 0; i < shoe.length; i++) {
            shoe[i] = 250 + (5 * i);

        }
        for(int size: shoe){
            System.out.println(size + " 재고 있음");
        }
    }
}
