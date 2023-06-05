package easy.cycles.ternaryOperation;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int first=sc.nextInt(),second=sc.nextInt(),third=sc.nextInt();
        String answer=(first+second>third && second+third>first && first+third>second?"Yes":"No");
        System.out.println(answer);

//        int i = 0;
//        if (a + b > c) ++i;
//        if (a + c > b) ++i;
//        if (b + c > a) ++i;
//        System.out.println(i == 3 ? "Yes" : "No");


    }
}
