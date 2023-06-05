package easy.cycles.whilec;
import java.util.Scanner;
public class Repeat1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        int suma=0;
        while(count!=0){

              suma+=sc.nextInt();
              count--;

        }
        System.out.println(suma);

    }
}
