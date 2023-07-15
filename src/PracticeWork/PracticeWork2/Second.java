package PracticeWork.PracticeWork2;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine(); // исходная строка
        int length = str.length();
        int startIndex = (length - 3) / 2; // вычисляем индекс начала подстроки
        String result = str.substring(startIndex, startIndex + 3); // получаем подстроку из 3 символов
        System.out.println(result); // выводим результат
    }
}
