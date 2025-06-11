package Level2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Class3 {
    public static void main(String[] args) {
        // 최소, 최대
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("배열 개수 입력 : ");
        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            int random = rand.nextInt(50) + 1;
            array[i] = random;
        }

        System.out.println(Arrays.toString(array));

        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("최댓값 : " + max);
        System.out.println("최솟값 : " + min);

    }
}
