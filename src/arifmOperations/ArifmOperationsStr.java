package arifmOperations;

import java.util.Scanner;

public class ArifmOperationsStr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String num=sc.next();
        int mult=1;
        for (int i = 0; i < num.length(); i++) {
            mult*=Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        System.out.println(mult);
    }
}
