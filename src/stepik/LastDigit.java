package stepik;
import java.util.Scanner;
public class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt()%10);
        sc.close();
    }
}
