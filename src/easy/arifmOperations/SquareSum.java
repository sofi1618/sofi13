package easy.arifmOperations;

import java.util.Scanner;

public class SquareSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int char1 = Integer.parseInt(String.valueOf(num.charAt(0)));
        int char2 = Integer.parseInt(String.valueOf(num.charAt(1)));
        int char3 = Integer.parseInt(String.valueOf(num.charAt(2)));
        int sumOfDigits = char1 + char2 + char3;
        double square = sumOfDigits * sumOfDigits;
        System.out.printf("%.3f%n", square);
    }
}
