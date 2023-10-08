package easy.string;

import java.util.Scanner;

public class FirstOrLast {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String num=sc.next();
        int firstChar = Integer.parseInt(String.valueOf(num.charAt(0)));
        int lastChar = Integer.parseInt(String.valueOf(num.charAt(num.length() - 1)));
        System.out.println(firstChar>lastChar?firstChar:firstChar==lastChar?"=":lastChar);
    }
}
