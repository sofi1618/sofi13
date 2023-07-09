package PracticeWork;

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        String NewString = "";
        for (int i = 0; i < str.length(); i++) {
             NewString += String.valueOf(str.charAt(i)) + String.valueOf(str.charAt(i)) ;
        }
        System.out.println(NewString);
    }
}
