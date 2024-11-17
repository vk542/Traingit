package StringPrograms;

public class ReverseString {
    public static void main(String[] args) {
        String s = "abcd";
        String rev = "";

        int i;
        for (i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
            // ch = s.charAt(i);
            // System.out.println(s.charAt(i));
        }
        System.out.println("Reverse of a strimg :" + rev);
    }
}
