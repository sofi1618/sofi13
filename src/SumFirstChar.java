import java.util.Scanner;

public class SumFirstChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int char1 = Integer.parseInt(String.valueOf(num.charAt(0)));
        int char2 = Integer.parseInt(String.valueOf(num.charAt(3)));
        System.out.println(char1+char2);
    }
}
