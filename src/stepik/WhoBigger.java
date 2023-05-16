package stepik;
import java.util.Scanner;
public class WhoBigger {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int first=sc.nextInt();
        int second=sc.nextInt();
        if (first>second){
            System.out.println(first);
        }else {
            System.out.println(second);
        }
        System.out.println(first > second ? first: second);
    }
}
