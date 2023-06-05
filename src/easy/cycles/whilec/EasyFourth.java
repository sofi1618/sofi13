package easy.cycles.whilec;
import java.util.Scanner;
public class EasyFourth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt(),num2=sc.nextInt();
        int count=num1;

        while (num1<=num2){
               if(num1%count==0) System.out.println(num1);

               num1+=count;
        }




    }
}
