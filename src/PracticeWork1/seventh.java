package PracticeWork1;
import java.math.BigInteger;
public class seventh {
    public static void main(String[] args) {
        int number = 0;
        int suma = 0;
        while (number <= 20) {
            BigInteger n = new BigInteger(Integer.valueOf(number).toString()); // the number to check
            if (n.isProbablePrime(100)) {
                suma += number;
            }
            number+=1;
        }

        System.out.println(suma);


    }
}


