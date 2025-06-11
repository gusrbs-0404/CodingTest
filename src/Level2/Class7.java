package Level2;

import java.util.Random;

public class Class7 {
    public static void main(String[] args) {
        // 과제 안 내신 분..?
        Random rand = new Random();
        int num1 = rand.nextInt(30) + 1;
        int num2 = rand.nextInt(30) + 1;

        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }

        for (int i = 0; i < array.length; i++) {
            if(i != num1 && i != num2) {
                System.out.println("과제 냄 " + array[i]);
            } else {
                System.out.println("과제 안냄 " + array[i]);
            }
        }
    }
}
