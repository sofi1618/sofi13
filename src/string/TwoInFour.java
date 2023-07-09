package string;

import java.util.Scanner;

public class TwoInFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num=sc.next();
        String char1 = String.valueOf(num.charAt(1));
        String char2 = String.valueOf(num.charAt(2));
        System.out.println(Integer.parseInt(char1)!=0? char1 + char2: char2);
    }
}
