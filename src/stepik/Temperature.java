package stepik;
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double t= sc.nextDouble();

        if (t<22.4){
            System.out.println("Холодно");
        } else if (t>22.4) {
            System.out.println("Тепло!");

        }else {
            System.out.println("Прохладно...");
        }
        System.out.print(t < 22.4 ? "Холодно(" : t > 22.4 ? "Тепло!" : "Прохладно...");
    }
}
