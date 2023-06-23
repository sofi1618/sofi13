package array;

import java.util.Arrays;
import java.util.Scanner;

public class Kindergarten {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int[] age = new int[size];
        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            names[i]= sc.next();
            age[i]= sc.nextInt();
        }
        int maxNumber = Arrays.stream(age).max().orElse(0);
        int minNumber = Arrays.stream(age).min().orElse(0);
        int index = -1;
        int index2 = -1;
        for (int i = 0; i < size; i++) {
            if (age[i] == minNumber) {
                index = i;
                break;
            }
        }
        for (int i = 0; i < size; i++) {
            if (age[i] == maxNumber) {
                index2 = i;
                break;
            }
        }
        System.out.println(names[index]);
        System.out.println(names[index2]);

    }
}
