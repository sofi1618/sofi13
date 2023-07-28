package Practice.MethodVoidPractice;

import java.util.Scanner;

class Calculator {
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void multiply(int a,int b){
        System.out.println(a*b);
    }
    public void substract(int a,int b){
        System.out.println(a-b);
    }
    public void divide(int a,int b){
        System.out.println(a/b);
    }

}

class calculate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        int first=sc.nextInt();
        String operations =sc.next();
        int second= sc.nextInt();
        if (operations.equals("+")){
            calculator.add(first,second);
        } else if (operations.equals("-")) {
            calculator.substract(first,second);
        } else if (operations.equals("*")) {
            calculator.multiply(first,second);
        } else if (operations.equals("/")) {
            calculator.divide(first,second);
        }else System.out.println("Incorrect");


    }

}