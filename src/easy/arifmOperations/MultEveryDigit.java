package easy.arifmOperations;

import java.util.Scanner;

public class MultEveryDigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String n=sc.next();
        int num=Integer.parseInt(n);
        System.out.println(((num / 100)  * ((num / 10) %10) * (num % 10)));

//        int n = sc.nextInt();
//        int sum = 1;
//        while(n != 0){
//            sum *= (n % 10);
//            n/=10;
//        }
//        System.out.println(sum);
    }
}
