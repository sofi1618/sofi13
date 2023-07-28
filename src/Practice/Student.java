package Practice;

import java.util.ArrayList;
import java.util.Scanner;


class Student {
    Scanner sc = new Scanner(System.in);
    private ArrayList<String> names = new ArrayList<>();
    private ArrayList<Integer> ages = new ArrayList<>();
    private ArrayList<Integer> balls = new ArrayList<>();
    int sumaBalls = 0;

    public void Name() {
        System.out.println("Input name student: ");
        String nameStudent = sc.nextLine();
        names.add(nameStudent);
        sc.nextLine(); // Чтение символа новой строки
    }

    public void Age() {
        System.out.println("Input age student: ");
        int ageStudent = sc.nextInt();
        ages.add(ageStudent);
        sc.nextLine();
    }

    public void ball() {
        System.out.println("Input balls student: ");
        int ballsStudent = sc.nextInt();
        balls.add(ballsStudent);
        sc.nextLine();
    }

    public void DisplayInfo(){
        int size = names.size();
        for (int i = 0; i < size; i++) {
            String name = names.get(i);
            int age = ages.get(i);
            int ball = balls.get(i);
            sumaBalls += ball;
            System.out.println(name + " " + age + " " + ball);
        }
    }
    public void Average() {
        double average = (double) sumaBalls / names.size();
        System.out.println("Average: " + average);
    }
}

class FullInfoStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Input info : ");
        System.out.println("Input count students : ");
        int count = sc.nextInt();
        sc.nextLine(); // Добавьте эту строку для очистки буфера после ввода числа count
        while (count > 0) {
            student.Name();
            student.Age();
            student.ball();
            count--;
        }
        student.DisplayInfo();
        student.Average();
    }
}