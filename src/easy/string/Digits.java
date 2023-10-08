package easy.string;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num=sc.next();
        String char1 = String.valueOf(num.charAt(0));
        String char2 = String.valueOf(num.charAt(1));
        String char3 = String.valueOf(num.charAt(2));
        String char4 = String.valueOf(num.charAt(3));
        System.out.println(char1 + char3 + char2 + char4);

    }
}
