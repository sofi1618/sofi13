package stepik;
import java.util.Scanner;
public class EasySixth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int suma=0;
        while (num!=0){
            suma+=num;
            num=sc.nextInt();
        }
        System.out.println(suma);

    }
}
