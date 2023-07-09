package array;

import java.util.Arrays;
import java.util.Scanner;

public class MinElDoubleAr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] numbers = new double[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextDouble();
        }
        double minElement = Arrays.stream(numbers).min().orElseThrow();
        System.out.printf("%.2f%n", minElement*2);

    }
}
