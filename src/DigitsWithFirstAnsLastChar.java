import java.util.Scanner;

public class DigitsWithFirstAnsLastChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        String char1 = String.valueOf(num.charAt(0));
        String char2 = String.valueOf(num.charAt(3));
        System.out.println(char1+char2);
    }
}
