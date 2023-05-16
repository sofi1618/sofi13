package stepik;
import java.util.Scanner;
public class ReadingNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        double elements=0;
        double average;
        double num=sc.nextInt();
        while (num!=0){
            count++;
            elements+=num;
            num=sc.nextInt();


        }
        average=elements/count;
        System.out.println(average);


    }
}
