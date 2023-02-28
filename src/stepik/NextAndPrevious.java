package stepik;
import java.util.Scanner;
public class NextAndPrevious {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("The next number for the number " + a +" is " + (a+1) + ".");
        System.out.println("The previous number for the number " + a +" is " + (a-1) +  ".");
        sc.close();
    }
}
