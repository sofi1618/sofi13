package easy.array;

import java.util.Scanner;

public class SumElemReverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(),suma=0;


        int[] number = new int[n];

        for (int i = 0; i < n; i++) {
            number[i]=sc.nextInt();
            suma+=number[i];
        }
        System.out.println(suma);

        for (int i = number.length - 1; i >=0 ; i--) {
            System.out.println(number[i]);

        }

    }
}
