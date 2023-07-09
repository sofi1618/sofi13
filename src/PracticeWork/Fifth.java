package PracticeWork;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        String tast= "b";
        int count=0;
        for (int i = 0; i < str.length()-2; i++) {
            if (str.charAt(i) == tast.charAt(0) && str.charAt(i + 2) == tast.charAt(0)){
                count++;
            }
        }
        System.out.println(count);

    }
}
