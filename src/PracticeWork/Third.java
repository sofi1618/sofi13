package PracticeWork;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        String prevLastChar=String.valueOf(str.charAt(str.length()-2));
        String lastChar=String.valueOf(str.charAt(str.length()-1));
        String result=prevLastChar + lastChar + str.substring(0 , str.length()-2);
        System.out.println(result);
    }
}
