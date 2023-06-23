package easy.count;
import java.util.Scanner;
public class Dollars {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start= sc.nextInt(),end=sc.nextInt();
        while (start<=end){
            System.out.println(start + " " + start + ".$");
            start++;
        }

    }
}
