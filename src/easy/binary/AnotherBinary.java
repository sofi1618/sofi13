package easy.binary;

import java.util.Scanner;

public class AnotherBinary {
    public static String main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        StringBuilder result = new StringBuilder();

        while (n > 0) {
            int remainder = n % k;
            char digit = Character.forDigit(remainder, k);
            result.insert(0, digit);
            n /= k;
        }

        return result.toString();


    }
}
