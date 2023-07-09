package PracticeWork;

import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        for (int i = 0; i < str.length(); i++) {
             if (String.valueOf(str.charAt(i)).equals("a") || String.valueOf(str.charAt(i)).equals("s")){
                 count++;
             }
        }
        System.out.println(count);
    }
}
