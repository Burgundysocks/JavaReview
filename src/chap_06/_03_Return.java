package chap_06;

public class _03_Return {
    //호텔 전화번호
    public static String getPhoneNumber(){
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }
    //호텔 주소
    public static String getAddress(){
        String address = "서울";
        return address;
    }

    public static void main(String[] args) {
        //반환값
        String phoneNumber = getPhoneNumber();
        String address = getAddress();
        System.out.println(phoneNumber);
        System.out.println(address);
    }
}
