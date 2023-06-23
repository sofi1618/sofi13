package arifmOperations;

import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int katetFirst= sc.nextInt(),katetSecond=sc.nextInt();
        double hipotenusa=Math.sqrt(katetFirst*katetFirst + katetSecond*katetSecond);
        System.out.println(hipotenusa);


    }
}
