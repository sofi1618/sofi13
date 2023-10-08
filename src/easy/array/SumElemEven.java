package easy.array;

import java.util.Scanner;

public class SumElemEven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(),suma=0;
        int[] number = new int[n];

        for (int i = 0; i < n; i++) {
            number[i]=sc.nextInt();
            if(i%2==0) suma+=number[i];
        }
        System.out.println(suma);
        for (int i = 0; i < n; i+=2) {
            System.out.println(number[i]);

        }

    }
}
