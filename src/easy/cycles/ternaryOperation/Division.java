package easy.cycles.ternaryOperation;
import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int first= sc.nextInt();
        int second= sc.nextInt();


        System.out.println(second!=0? (double) first/second:"Error");

    }
}
