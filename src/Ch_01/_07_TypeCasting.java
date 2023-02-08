package Ch_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        int score = 93;
        System.out.println(score);
        System.out.println((float) score);
        System.out.println((double) score);

        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int)score_f);
        System.out.println((int)score_d);

        score = 93+(int) 98.8;
        System.out.println(score);

        score_d = 93+98.8;
        System.out.println(score_d);

        double convertedScoreDouble = score;

        int convertedScoreInt = (int)score_d;

        String s1 = String.valueOf(94);
        s1 = Integer.toString(94);
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        int i = Integer.parseInt("95");
        System.out.println(i);
        double d = Double.parseDouble("98.8");
        System.out.println(d);

//        int error = Integer.parseInt("자바");
//        System.out.println(error);
    }
}
