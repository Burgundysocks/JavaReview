package chap_02;

public class _01_Operator1 {
    //연산자
    public static void main(String[] args){
    //산술 연산자

    //일반 연산
        System.out.println(4 + 1); //5
        System.out.println(4 - 2); //2
        System.out.println(4 * 2); //8
        System.out.println(4 / 2); //2
        System.out.println(5 / 2); //2.5가 나와야하지만 몫만 갖고옴 그렇기에 2
        System.out.println(4 % 2); //0

        //우선순위 연산
        System.out.println(2 + 2 * 2); //6
        System.out.println((2 + 2) * 2); // 8
        System.out.println(2 + 2 / 2); //3
        System.out.println((2 + 2) / 2); //2

        //변수 이용 연산
        int a = 20;
        int b = 10;

        int c;

        c = a+b;
        System.out.println(c);//30
        c = a -b;
        System.out.println(c); //10
        c = a * b;
        System.out.println(c); //200
        c = a / b;
        System.out.println(c); //2

        //증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val);//10
        System.out.println(++val);//11
        System.out.println(val++);//11

        val = 10;
        System.out.println(val);//10
        System.out.println(val++);//10
        System.out.println(val);//11

        val = 10;
        System.out.println(val);//10
        System.out.println(--val);//9
        System.out.println(val--);//9

        val = 10;
        System.out.println(val);//10
        System.out.println(val--);//10
        System.out.println(val);//9

        //은행 대기번호
        int waiting = 0;
        System.out.println("대기인원 : " + waiting++);
        System.out.println("대기인원 : " + waiting++);
        System.out.println("대기인원 : " + waiting++);
        System.out.println("대기인원 : " + waiting);


    }
}
