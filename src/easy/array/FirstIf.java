package easy.array;

import java.util.Scanner;

public class FirstIf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt(),count=0;
        double[]numbers=new double[n];
        boolean flag=false;

        for (int i = 0; i < n; i++) {
            numbers[i]= sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            count++;
            if((numbers[i] < 2.5) && (!flag)){
                flag=true;
                System.out.printf("%d %.2f\n",count,numbers[i]);

            }
        }
        if (!flag){
            System.out.println("Not found");
        }

    }
}
