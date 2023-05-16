package stepik;
import java.util.Scanner;
public class SumSq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int suma=0;
        int numbers=1;
        while (numbers<=num){
              suma+=numbers*numbers;
              numbers++;
        }
        System.out.println(suma);



    }
}
