package array;

import java.util.Scanner;

public class AverageMiddle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int count= sc.nextInt(),counter=0;
        float[] numbers = new float[count];
        float suma=0;
        boolean flag=false;
        for (int i = 0; i < count; i++) {
            numbers[i]= sc.nextFloat();
            if(numbers[i]>0) {
                flag = true;
                counter++;
                suma += numbers[i];
            }

        }
        if(flag){
            System.out.printf("%.2f",suma/counter);
        }else {
            System.out.println("Not Found");
        }
    }
}
