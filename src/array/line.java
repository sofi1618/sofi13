package array;

import java.util.Scanner;

public class line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0; i<n; i++) {
            a[i]=sc.nextInt();
        }
        int petya=sc.nextInt();
        int place=1;
        for(int i=0; i<n; i++) {
            if(a[i]>=petya) {
                place++;
            }
        }
        System.out.println(place);


    }
}
