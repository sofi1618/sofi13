package arifmOperations;

import java.util.Arrays;
import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int index=0;
        int[] arr= new int[1000];

        while (num!=0){
            arr[index]=num;
            num= sc.nextInt();
            index++;
        }

        int maxNumber = Arrays.stream(arr).max().orElse(0);
        System.out.println(maxNumber);
    }
}
