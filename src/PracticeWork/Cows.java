package PracticeWork;

import java.util.Scanner;
public class Cows {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String count = sc.next();
        char lastChar = count.charAt(count.length() - 1);
        int number = Integer.parseInt(String.valueOf(lastChar));
        int num = Integer.parseInt(String.valueOf(count));

        String answer=(num>=10 && num<=20 ? count + " коров" : number==1?count + " корова" : 2<=number && number<=4 ? count + " коровы"  : count + " коров");

        System.out.println(answer);

    }
}
