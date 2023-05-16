package stepik;
import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print((sc.nextInt()>=21) ?"Да" : "Нет");
        int a = 255;
        int b = a++;
        a /= 8;
        b *= 2;
        int c = b / 10;
        if (a + b + c > 600){
            System.out.println(--b);
        }else{
            System.out.println(c++);
        }

    }
}
