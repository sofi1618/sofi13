package easy.string;

import java.util.Scanner;

public class FirstLastEl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num=sc.next();
        String firstChar = String.valueOf(num.charAt(0));
        String secondChar = String.valueOf(num.charAt(1));
        String lastChar = String.valueOf(num.charAt(2));
        System.out.println(lastChar+secondChar+firstChar);

    }
}
