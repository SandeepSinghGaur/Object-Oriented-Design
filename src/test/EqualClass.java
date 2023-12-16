package src.test;

public class EqualClass {
    public static void main(String[] args) {
        String s1 = new String("Sandeep");
        String s2 = new String("Sandeep");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
