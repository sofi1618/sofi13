package arifmOperations;
import java.util.Scanner;
import java.text.DecimalFormat;
public class TriangleSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double first =sc.nextDouble(),second =sc.nextDouble(),third =sc.nextDouble();

        DecimalFormat decimalFormat = new DecimalFormat("#.########");

        String formattedNumber  = decimalFormat.format( ((Math.sqrt(first) + Math.sqrt(second) + Math.sqrt(third))*(Math.sqrt(first) + Math.sqrt(second) + Math.sqrt(third))));

        System.out.println(formattedNumber);
    }
}
