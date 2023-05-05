import java.util.*;
public class chartoint {
    public static void main(String[] args) {
        int i = 1234;
        String str = String.valueOf(i);
        System.out.println(str);
        char c = str.charAt(2);
        int dig = Character.forDigit(c);
        System.out.println(dig);
    }
}
