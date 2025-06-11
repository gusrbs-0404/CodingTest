package Level2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Class6 {
    public static void main(String[] args) {
        // 공 바꾸기
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("바구니 개수 : ");
        int n = sc.nextInt();

        System.out.print("바꿀 횟수 : ");
        int m = sc.nextInt();

        int[] arr = new int[n];

        for (int k = 0; k < n; k++) {
            arr[k] = k;
        }

        System.out.println(Arrays.toString(arr));

        for(int k = 0; k < m; k++) {
            System.out.println("공 바꾸기");

            System.out.print("첫번째 바구니 : ");
            int i = sc.nextInt();

            System.out.print("두번쨰 바구니 : ");
            int j = sc.nextInt();

            int num = arr[i];
            arr[i] = arr[j];
            arr[j] = num;
            System.out.println(Arrays.toString(arr));
        }
    }
}
