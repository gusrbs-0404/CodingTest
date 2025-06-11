package Level2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Class4 {
    public static void main(String[] args) {
        // 최댓값
        Scanner sc = new Scanner(System.in);

        int[] array = {3, 29, 38, 12, 57, 74, 40, 85, 61};

        int max = array[0];
        int n = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if(array[i] == max) {
                n = i;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("최댓값 : " + max);
        System.out.println("최댓값 위치 " + (n+1));


    }
}
