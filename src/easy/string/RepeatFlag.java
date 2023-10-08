package easy.string;

import java.util.Scanner;

public class RepeatFlag {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String flag="No";
        int test= sc.nextInt();
        while (test!=0){
               String num=sc.next();
               char lastchar=num.charAt(num.length() - 1);
               if(Integer.parseInt(String.valueOf(lastchar))==4) flag="Yes";
               test--;
        }
        System.out.println(flag);


    }
}
