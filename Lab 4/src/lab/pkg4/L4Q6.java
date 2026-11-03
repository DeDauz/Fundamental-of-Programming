package lab.pkg4;

import java.util.Random;

/**
 * @author Ng Zhi Yang
 */
public class L4Q6 {
    public static void main(String[] args) {
        int counts = 0;
        int randomNumber = new Random().nextInt(Integer.MAX_VALUE);
        System.out.println("Random number = " + randomNumber);
        for(int i = 0; randomNumber > 0; randomNumber /= 10, i++) {
            int digit = randomNumber % 10;
            System.out.printf("%15d = %d%n", ((int) Math.pow(10, i)), digit);
            counts += 1;
        }
        
        System.out.println("There are " + counts + " digits in the random number generated.");
    }
}
