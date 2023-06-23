package array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<String> set = new HashSet<>();
        int size= sc.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
             numbers[i]=sc.nextInt();
             set.add(String.valueOf(numbers[i]));
        }
        for (String element : set) {
            System.out.println(element);
        }
    }
}
