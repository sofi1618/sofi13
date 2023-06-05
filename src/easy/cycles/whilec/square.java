package easy.cycles.whilec;
import java.util.Scanner;
public class square {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int square=0;
        while (square++ * square <= num) {
            System.out.println(square * square);
        }

    }
}
