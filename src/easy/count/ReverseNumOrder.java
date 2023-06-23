package easy.count;

import java.util.Scanner;

public class ReverseNumOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int first=sc.nextInt(),second= sc.nextInt();
        for (int i = second; i >=first ; i-=2) {
            System.out.println(i);
        }

        }


    }

