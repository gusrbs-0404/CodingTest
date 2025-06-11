package Level1;

import java.util.Random;

public class Class11 {
    public static void main(String[] args) {
        // A + B - 5
        Random rand = new Random();

        for (int i = 1; i <= 6; i++) {
            int a = rand.nextInt(10) + 1;
            int b = rand.nextInt(10) + 1;

            int sum = a + b;
            System.out.println(a + " + " + b + " = " + sum);
        }
    }
}
