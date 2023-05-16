package PracticeWork1;
import java.util.Scanner;
public class ninth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        int start = sc.nextInt();
        int end = sc.nextInt();
        int sum = 0;
        int count = 0;

        for (int i = end; i <= start; i++) {
            sum += i;
            count++;
        }

        double average = (double) sum / count;

        System.out.println( average);
    }

}

