package stepik;
import java.util.Scanner;
public class EvenNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int first=sc.nextInt(),second=sc.nextInt();
        while (first<second){
            if (first%2==0){
                System.out.println(first);
            }
            first++;
        }

    }
}
