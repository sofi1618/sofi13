package PracticeWork1;
import java.util.Scanner;
public class eighth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        boolean flag=(a + b == c | a + c == b | b + c == a)?true:false;
        System.out.println(flag);


    }
}
