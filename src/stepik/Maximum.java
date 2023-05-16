package stepik;
import java.util.Scanner;
public class Maximum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int first=sc.nextInt();
        int second=sc.nextInt();
        int third=sc.nextInt();

        int maximum1=Math.max(first,second);
        int maximum2=Math.max(maximum1,third);

        System.out.println(maximum2);


    }
}
