package string;

import java.util.Scanner;

public class CountWordsSentences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        System.out.println(words.length);
    }

}
