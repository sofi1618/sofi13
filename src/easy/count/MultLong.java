package easy.count;
import java.util.Scanner;
public class MultLong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long count= sc.nextLong();
        long result=1;
        while (count!=0){
              result*= sc.nextLong();
              count--;

        }
        System.out.println(result);
    }
}
