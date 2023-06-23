package easy.count;
import java.util.Scanner;
public class AgainSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=1,suma=0;

        while (count<=num){
            suma+=count;
            count++;
        }
        System.out.println(suma);
    }
}
