package easy.count;

import java.util.Scanner;

public class schoolBalls {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(num>=1 && num<=3?"Initial": num>=4 && num<=6?"Average": num>=7 && num<=9?"Sufficient":"High");

    }
}
