package easy.count;
import java.util.Scanner;
public class MiddleAge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test = sc.nextInt();
        int count=0;
        int counter=test;
        double average;

        while (test!=0){
            String name= sc.next();
            int age=sc.nextInt();
            count+=age;
            test--;
        }
        average= (double) count /counter;
        System.out.println(average);

    }
}
