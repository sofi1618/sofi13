package ArifmeticOperations;
import java.util.Scanner;
public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int result = (int) Math.ceil(Math.log10(num));
        System.out.println(result);
    }
}
