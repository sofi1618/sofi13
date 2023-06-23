package PracticeWork.PracticeWork1;
import java.util.Scanner;
public class Fourth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input catets ");
        int catet1 = sc.nextInt();
        int catet2= sc.nextInt();

        System.out.println("Input hipotenusa ");
        int hipotenusa= sc.nextInt();

        System.out.println(catet1*catet1 + catet2*catet2==hipotenusa*hipotenusa?"yes":"no");



    }
}
