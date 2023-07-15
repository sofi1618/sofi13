package Practice;

import java.util.Scanner;

class rectangle {
      int width;
      int height;
      int perimetr;
      int square;
}
class arifmwticOperations{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        rectangle data=new rectangle();

        data.width= sc.nextInt();
        data.height= sc.nextInt();
        data.perimetr= 2*(data.width+ data.height);
        data.square=data.width* data.height;

        System.out.println(data.perimetr + " " + data.square);

    }
}