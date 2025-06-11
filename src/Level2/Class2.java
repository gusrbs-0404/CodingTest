package Level2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Class2 {
    public static void main(String[] args) {
        // X보다 작은 수
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("배열 개수 입력 : ");
        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            int random = rand.nextInt(10) + 1;
            array[i] = random;
        }

        System.out.println(Arrays.toString(array));

        System.out.print("찾을 숫자 입력(1~10) : ");
        int num = sc.nextInt();

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                count++;
            }
        }

        System.out.println("총 개수 : " + count);

    }
}
