package PracticeWork.PracticeWork2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Nineth {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int DaysInMonth=0;
        int sumaDays=0;
        int temperature;
        int index = -1;
        int index2 = -1;
        int maxTemperature;
        int minTemperature;
        int days=1;

        while (true){
            System.out.println("Input month");
            String month=sc.nextLine().toLowerCase();
            if(month.equals("january") || month.equals("march") || month.equals("may") || month.equals("july")
                    || month.equals("august") || month.equals("october") || month.equals("december")){
                DaysInMonth=31;
                System.out.println("Input days ");
                break;
            } else if (month.equals("april") || month.equals("june") || month.equals("september") || month.equals("november")) {
                DaysInMonth=30;
                System.out.println("Input days ");
                break;
            } else if (month.equals("february")) {
                DaysInMonth=28;
                System.out.println("Input days ");
                break;

            }else System.out.println("Re-enter the month");

        }
        ArrayList<Integer> temperaturesMonth = new ArrayList<>();
        for (int i = 0; i < DaysInMonth; i++) {
            System.out.println(days + ":");
            while (true) {
                temperature = sc.nextInt();
                if (temperature >= -100 && temperature <= 100) {
                    temperaturesMonth.add(temperature);
                    break;
                } else {
                    System.out.println("Input re-enter ");
                }
            }
            sumaDays += temperature;
            days++;
        }

        maxTemperature= Collections.max(temperaturesMonth);
        minTemperature= Collections.min(temperaturesMonth);

        for (int i = 0; i < DaysInMonth; i++) {
            if (temperaturesMonth.get(i) == minTemperature) {
                index = i + 1;
                break;
            }
        }
        for (int i = 0; i < DaysInMonth ;i++) {
            if (temperaturesMonth.get(i) == maxTemperature) {
                index2 = i + 1;
                break;
            }
        }
        System.out.println("Average temperature month = " + (sumaDays/temperaturesMonth.size()));
        System.out.println("Max Temperature " + maxTemperature + " day " + index2);
        System.out.println("Min Temperature " + minTemperature + " day " + index);


    }
}


