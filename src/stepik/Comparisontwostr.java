package stepik;
import java.util.Scanner;
public class Comparisontwostr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String strFirst = sc.nextLine();
        String strSecond = sc.nextLine();
        String strThird = sc.nextLine();
        System.out.println((strFirst.equals(strSecond) && !strSecond.equals(strThird)) || (strSecond.equals(strThird) && !strThird.equals(strFirst)) || (strThird.equals(strFirst) && !strFirst.equals(strSecond))? "Yes":"No");


    }
}