package PracticeWork;

import java.util.Scanner;

import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String element = sc.nextLine();
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            boolean flag = true;
            for (int j = 0; j < element.length(); j++) {
                if (String.valueOf(str.charAt(i)).equals(String.valueOf(element.charAt(j)))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                newStr += str.charAt(i);
            }
        }
        System.out.println(newStr);
    }
}
