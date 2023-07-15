package Practice;

import java.util.Scanner;

class student {
    String name;
    String lastname;
    int age;
}

class StudentFullInformation{
    public static void main(String[] args) {
        student person=new student();
        Scanner sc=new Scanner(System.in);
        System.out.println("Input name");
        person.name=sc.next();
        System.out.println("Input lastname");
        person.lastname=sc.next();
        System.out.println("Input age");
        person.age= sc.nextInt();
        System.out.println("Thanks");



    }
}
