package easy.string;
import java.util.Scanner;
public class MultParseInt {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int mult=1;
        while (true){
            String str=sc.next();
            if(str.equals("СТОП"))break;
            int num = Integer.parseInt(str);
            if(num!=0) mult*=num;
        }
        System.out.println(mult!=1?mult:"Не найдено");


    }
}
