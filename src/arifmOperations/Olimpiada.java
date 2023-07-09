package arifmOperations;

import java.util.Scanner;

public class Olimpiada {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int hour= sc.nextInt(),minute= sc.nextInt(),seconds= sc.nextInt();
        int hour2= sc.nextInt(),minute2= sc.nextInt(),seconds2= sc.nextInt();
        int result1=Math.abs(hour2-hour);
        System.out.println(Math.abs(hour2-hour) + " " + Math.abs(minute2-minute) + " " + Math.abs(seconds2-seconds));

    }
}
