package string;
import java.util.Scanner;
public class FindCub2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String parasit1="ээээ";
        String parasit2= "потом";
        String flag="Куб";
        String flag2="СТОП";
        int count=0;
        int result=0;

        while (true){
              String str= sc.next();

              if(str.equals(parasit1)|| str.equals(parasit2)) continue;
              count++;
              if (str.equals(flag)) {

                  result=count;
              }
              if(str.equals(flag2)) break;

        }
        System.out.println(result!=0?result:"NO");



    }
}
