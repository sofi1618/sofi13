package easy.Practice.MethodVoidPractice;

import java.util.Scanner;

class Car {

      public void startEngine(){
          System.out.println("auto started");
      }
      public void stopEngine(){
        System.out.println("auto stoped");
      }
      public void drive(){
          System.out.println("auto drive");

      }
}
class user{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Car auto=new Car();
        System.out.println("Please speak : Start or stop or drive");
        String word=sc.next();
        if (word.equals("start")){
            auto.startEngine();
        } else if (word.equals("stop")) {
            auto.stopEngine();
        } else if (word.equals("drive")) {
            auto.drive();
        }else{
            System.out.println("Incorrect");
        }

    }
}
