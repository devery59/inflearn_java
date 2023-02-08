package Ch_02;

public class Quiz {
    public static void main(String[] args) {
        int height = 115;
        String result = height >= 120 ? "가능" : "불가능";
        System.out.println("키가 "+height+"cm 이므로 탑승 " + result+"합니다");
        height = 121;
        String result2 = height >= 120 ? "가능" : "불가능";
        System.out.println("키가 "+height+"cm 이므로 탑승 " + result2+"합니다");


    }
}
