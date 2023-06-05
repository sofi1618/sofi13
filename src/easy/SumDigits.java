package easy;
import java.util.Arrays;
import java.util.Scanner;
public class SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        String numberString = String.valueOf(number);
        int[] digits = new int[numberString.length()];
        int suma=0;
        for (int i = 0; i < numberString.length(); i++) {
            digits[i] = Character.getNumericValue(numberString.charAt(i));
            suma+=digits[i];

        }

        System.out.println(suma);



    }
}
