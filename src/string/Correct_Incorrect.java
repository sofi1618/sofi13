package string;

import java.util.Scanner;

public class Correct_Incorrect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter=1;
        while (true){
              String password=sc.next();
              String password2=sc.next();
              if(password.equals(password2)){
                  System.out.println("CORRECT");
                  break;
              }else {
                  System.out.println("INCORRECT " + counter);
              }
              if (counter == 5) {
                System.out.println("Error");
                break;
              }
              counter++;



        }


    }
}

