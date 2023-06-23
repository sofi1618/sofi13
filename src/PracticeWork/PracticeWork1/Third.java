package PracticeWork.PracticeWork1;
import java.util.Scanner;
//Создайте переменную типа short. Инициализаируйте ее результатом выполнения следующих операций:
//        - суммой двух целых чисел;
//        - суммой целого и дробного чисел;
//        - суммой значений переменных типов float и int;
//        - суммой значений переменных типа byte + short;
//        - суммой значений переменных типа float + double;

public class Third {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        short suma;

        System.out.println("сумма двух целых чисел");
        int n1= sc.nextInt(),n2= sc.nextInt();
        suma= (short) (n1+n2);
        System.out.println("сумма двух целых чисел " + suma);

        System.out.println("сумма целого и дробного чисел");
        int nu1= sc.nextInt();
        double nu2= sc.nextDouble();
        suma=(short) (nu1+nu2);
        System.out.println("сумма целого и дробного чисел " + suma);

        System.out.println("сумма float и int ");
        float num2= sc.nextFloat();
        int num1= sc.nextInt();
        suma= (short) (num1+num2);
        System.out.println("сумма float и int " + suma);

        System.out.println("сумма byte + short");
        byte numb1= sc.nextByte();
        short numb2= sc.nextShort();
        suma= (short) (numb1+numb2);
        System.out.println("сумма byte + short" + suma);

        System.out.println("сумма float + double");
        float number1= sc.nextFloat();
        double number2= sc.nextDouble();
        suma= (short) (number1+number2);
        System.out.println("сумма float + double"+ suma);





    }
}
