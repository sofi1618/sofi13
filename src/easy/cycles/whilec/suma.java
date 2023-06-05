package easy.cycles.whilec;
import java.util.Scanner;
public class suma {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int first=sc.nextInt(),second=sc.nextInt();
        int suma=0;
        while (first<=second){
            suma+=first;
            first++;

        }
        System.out.println(suma);

    }
}
