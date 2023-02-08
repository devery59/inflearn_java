package Ch_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C";
        System.out.println(s);
        System.out.println(s.length());

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        System.out.println(s.contains("Java"));
        System.out.println(s.indexOf("Java"));
        System.out.println(s.lastIndexOf("Java"));
        System.out.println(s.startsWith("I love"));
        System.out.println(s.endsWith("C"));
    }
}
