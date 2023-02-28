package ArifmeticOperations;

import java.util.Scanner;

public class EveryDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int num1,num2;
        num1=num/10;
        num2=num%10;
        System.out.println(num1 + " " + num2);

    }
}
