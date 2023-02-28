package books;

public class CodeBlock {
    public static void main(String[] args) {
        int number1=10 , number2=20;
        if (number1<number2){
            number1=number2;
            number2=0;
        }
        System.out.println(number1 + " " + number2);

        int num ,num2=20;
        for (num=0;num<10;num++){
            System.out.println(num);
            num2-=2;
            System.out.println(num2);

        }


    }
}
