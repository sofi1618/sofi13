package string;
import java.util.Scanner;
public class FindCub {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String flag="Куб";
        String flag2="СТОП";
        String answer="NO";
        while (true){
            String str=sc.next();
            if (str.equals(flag)) answer="YES";
            if (str.equals(flag2))break;
        }
        System.out.println(answer);
    }
}
