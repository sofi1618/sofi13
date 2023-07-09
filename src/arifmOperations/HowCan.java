package arifmOperations;

import java.util.Scanner;

public class HowCan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int count = 0;
        while (n > 0) {
            int sum = getDigitSum(n);
            n -= sum;
            count++;
        }

        System.out.println(count);
    }

    private static int getDigitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
//        Scanner sc=new Scanner(System.in);
//
//        int num=sc.nextInt();
//        int firstNum,secondNum,count=0,sumaNum=0;
//        while (num!=0){
//               firstNum=num/ 10;
//               secondNum=num%10;
//               sumaNum=firstNum+secondNum;
//               count++;
//               num-=sumaNum;
//        }
//        System.out.println(count);
    }
}
