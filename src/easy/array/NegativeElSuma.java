package easy.array;

import java.util.Scanner;
public class NegativeElSuma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] numbers = new double[n];
        double suma=0;
        int count=0;
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextDouble();
            if(numbers[i]<0){
                count++;
                suma+=numbers[i];
            }
        }
        System.out.print(count + " ");
        System.out.printf("%.2f%n",suma);

    }
}
