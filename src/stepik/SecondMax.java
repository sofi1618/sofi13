package stepik;

import java.util.*;

public class SecondMax {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
        int max = a;
        int max2 = 0;
        while (a !=0){
            int b = scanner.nextInt();
            if(max < b){
                max2 = max;
                max = b;
            }
            else  if (max2 < b) max2 = b;
            a = b;
        }
        System.out.println(max2);

    }
}
