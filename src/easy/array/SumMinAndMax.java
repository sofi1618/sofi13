package easy.array;

import java.util.Arrays;
import java.util.Scanner;

public class SumMinAndMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number[]=new int[n];
        for (int i = 0; i < n; i++) {
             number[i]= sc.nextInt();
        }
        System.out.println(Arrays.stream(number).min().orElse(0)+Arrays.stream(number).max().orElse(0));
    }
}
