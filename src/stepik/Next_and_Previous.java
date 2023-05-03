package stepik;
import java.util.Scanner;
public class Next_and_Previous {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();
        int num1 = number+1;
        int num2 = number - 1;
        System.out.println("The next number for the number " + number +" is " + num1 + "." + "\n" + "The previous number for the number " + number + " is " + num2+ ".");

    }
}
