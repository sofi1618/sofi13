package easy.arifmOperations;
import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int perimeter = 4 * n;
            int area = n * n;
            System.out.println(perimeter + " " + area);
        }
    }
}
