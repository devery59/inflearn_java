package Ch_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        System.out.println(2/4);
        System.out.println(4%2);
        System.out.println(5%2);

        int val;
        val = 10;
        System.out.println(val);
        val++;
        ++val;

        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); // 0
        System.out.println("대기 인원 : " + waiting++); // 1
        System.out.println("대기 인원 : " + waiting++); // 2
        System.out.println("총 대기 인원 :" + waiting); // 3

    }
}
