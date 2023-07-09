package string;

import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(countWords(sc.nextLine()));

    }
    public static int countWords(String text) {
        String[] words = text.split("\\s+"); // Разделение текста на слова по пробелам
        return words.length; // Возвращаем количество элементов массива слов
    }


}
