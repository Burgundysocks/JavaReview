package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        //조건문 ElseIf
        //오렌지 주스 +1
        //또는 망고주스 + 1
        //또는 아메리카노 + 1

        boolean mango = false;
        boolean orange = true;

        if( mango){
            System.out.println("망고주스 + 1");
        }else if( orange){
            System.out.println("오렌지주스 + 1");
        }else{
            System.out.println("아메리카노 + 1");
        }
    }
}
