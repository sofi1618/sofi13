package arifmOperations;
import java.util.Scanner;
public class Sumanum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt(),end=sc.nextInt();
        int suma=0;
        while (start<=end){
               suma+=start;
               start++;
        }
        System.out.println(suma);

    }
}
