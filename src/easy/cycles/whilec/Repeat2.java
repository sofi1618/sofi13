package easy.cycles.whilec;
import java.util.Scanner;
public class Repeat2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        int suma=0;
        while (count!=0){

              if(sc.nextInt()%2==0){
                  suma++;

              }
              count--;
        }
        System.out.println(suma);

    }
}
