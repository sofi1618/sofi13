package array;

import java.util.Scanner;
public class DoubleTwoX {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int count= sc.nextInt();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i]= sc.nextInt();
        }
        for (int i = 0; i <count; i++) {
            if(numbers[i]>=0) {
                numbers[i]= numbers[i] + 2;
            }
        }

        for (int x:numbers) {
            System.out.print(x + " ");
        }

    }
}
