package arifmOperations;

import java.util.Scanner;

public class CountOper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String elements= sc.next();
        int count=0;
        for (int x = 1; x < elements.length(); x++) {
            if (elements.charAt(x) == '*' || elements.charAt(x) == '-' || elements.charAt(x) == '+') {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
