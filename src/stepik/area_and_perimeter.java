package stepik;
import java.util.Scanner;
public class area_and_perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length=sc.nextInt();
        int weight= sc.nextInt();
        System.out.println((length*weight)+"\n"+(2*(length+weight)));
    }
}
