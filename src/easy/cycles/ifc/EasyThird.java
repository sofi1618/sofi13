package easy.cycles.ifc;
import java.util.Scanner;
public class EasyThird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        if (b>0)while(a<=b){ System.out.println(a); a++;}
        else
            while (a>=b){System.out.println(a);a--;}
    }
}