package stepik;
import java.util.Arrays;
import java.util.Scanner;
public class increase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int first=sc.nextInt(),second=sc.nextInt(),third=sc.nextInt();
        int[] numbers={first,second,third};
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }




    }
}
