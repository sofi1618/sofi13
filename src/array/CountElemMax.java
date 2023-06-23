package array;
import java.util.Arrays;
import java.util.Scanner;
public class CountElemMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array = new int[100];
        int index = 0;
        int input = sc.nextInt();
        int count=0;
        while (input!=0){
            array[index] = input;
            index++;
            input = sc.nextInt();

        }
        int max = Arrays.stream(array).max().orElse(0);
        for (int i = 0; i < array.length; i++) {
            if(array[i]==max)count++;
        }
        System.out.println(count);

    }
}
