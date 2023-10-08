package easy.array;
import java.util.Arrays;
import java.util.Scanner;

public class ModulMaxAr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] numbers = new double[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Math.abs(sc.nextDouble());
        }

        double maxElement = Arrays.stream(numbers).max().orElseThrow();
        System.out.printf("%.2f%n", maxElement);
    }
}