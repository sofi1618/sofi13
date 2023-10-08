package easy.string;

import java.util.Scanner;
public class Sentences {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int count = 0;

        for (char c : string.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
