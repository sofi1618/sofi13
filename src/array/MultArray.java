package array;

import java.util.Scanner;

public class MultArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]numbers=new int[n];
        int suma=0,count=0;
        for (int i = 0; i < n; i++) {
            numbers[i]=sc.nextInt();
            if(numbers[i]%6==0 && numbers[i]>0){
                count++;
                suma+=numbers[i];
            }
        }
        System.out.println(count + " " + suma);


    }
}
