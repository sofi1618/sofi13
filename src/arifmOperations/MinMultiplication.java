package arifmOperations;
import java.util.Scanner;
public class MinMultiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int mult=1;
        boolean flag=true;
        while (flag==true){
               mult++;
              if(num%mult==0){
                  flag=false;
              }


        }
        System.out.println(mult);


    }
}
