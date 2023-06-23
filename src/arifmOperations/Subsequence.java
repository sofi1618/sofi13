package arifmOperations;

import java.util.Scanner;

public class Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int countTri = 0;
        int countMinus = 0;
        while (x != 0){
            if (x % 3 == 0 && x < 0){
                countTri++;
                countMinus++;
            }
            else if (x % 3 == 0) countTri++;
            else if (x < 0) countMinus++;
            x = sc.nextInt();
        }
        if (countTri > countMinus) System.out.println(333);
        else if (countTri == countMinus) System.out.println("Equal");
        else System.out.println("negative");

        }

    }

