package easy.cycles.whilec;
import java.util.Scanner;
public class EasySecond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt(),end=sc.nextInt();
        while (start<=end){
            System.out.println(start);
            start++;
        }


    }
}
