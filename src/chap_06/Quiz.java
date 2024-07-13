package chap_06;

public class Quiz {
    public static String getHiddenData(String data, int index){
        String hidden = data.substring(0, index);
        for (int i = 0; i < data.length()-index; i++) {
            hidden += "*";
        }
        return hidden;
    }
    public static void main(String[] args) {
        String name="정상현";
        String id = "980920-1111111";
        String phone = "010-1111-1111";

        System.out.println(getHiddenData(name,1));
        System.out.println(getHiddenData(id,8));
        System.out.println(getHiddenData(phone,9));
    }
}
