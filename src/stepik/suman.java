package stepik;
import java.util.Scanner;
public class suman {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int first=sc.nextInt(),second=sc.nextInt();
        int count=0;
        while (first<=second){

            if(first%3==0 && first%5!=0) count++;

            first++;

        }
        System.out.println(count);

    }
}
