package stepik;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();//456
        int firstNum=n / 100;//4
        int secondNum=(n / 10) % 10;//5
        int thirdNum=n % 10;//6
        int suma=firstNum+secondNum+thirdNum;
        System.out.println(suma);
        sc.close();

    }
}
