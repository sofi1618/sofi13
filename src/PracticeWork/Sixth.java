//package PracticeWork;
//
//import java.util.Scanner;
//
//public class Sixth {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String test = "*";
//        String result = "";
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == test.charAt(0)) {
//                result += str.replace(String.valueOf(str.charAt(i)), "");
//                result += str.replace(String.valueOf(str.charAt(i - 1)), "");
//                result += str.replace(String.valueOf(str.charAt(i + 1)), "");
//            }
//            System.out.println(result);
//        }
//    }
//}