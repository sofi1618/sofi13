package stepik;
import java.util.Scanner;
public class ComparisonStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String first=sc.nextLine();
        String second= sc.nextLine();
        String third= sc.nextLine();

        System.out.println(first.equals(third) && second.equals(third) ? "Yes":"No");

    }
}
