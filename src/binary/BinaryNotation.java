package binary;
import java.util.Scanner;
public class BinaryNotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String st = Integer.toBinaryString(n);
        StringBuilder builder = new StringBuilder(st);
        System.out.println(builder.reverse());
    }
}
