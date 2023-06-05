package easy.count;
import java.util.Scanner;
public class CounNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int count = 0;
        int prevElement = sc.nextInt();

        while (true) {
            int currentElement = sc.nextInt();

            if (currentElement == 0) {
                break;
            }

            if (currentElement > prevElement) {
                count++;
            }

            prevElement = currentElement;
        }

        System.out.println(count);


    }
}
