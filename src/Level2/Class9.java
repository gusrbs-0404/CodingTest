package Level2;

import java.util.Arrays;
import java.util.Scanner;

public class Class9 {
    public static void main(String[] args) {
        // 바구니 뒤집기
        Scanner sc = new Scanner(System.in);

        System.out.print("바구니 갯수 : ");
        int a = sc.nextInt();

        int[] arr = new int[a];
        for(int i = 0; i < a; i++) {
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++) {
            System.out.println("바구니 뒤집기");

            System.out.print("첫번째 바구니 : ");
            int b = sc.nextInt() -1;

            System.out.print("두번쨰 바구니 : ");
            int c = sc.nextInt() -1;

            while (b < c) {
                int tmp = arr[b];

                arr[b] = arr[c];
                arr[c] = tmp;
                b++;
                c--;
            }
            System.out.println(Arrays.toString(arr));
        }

    }
}
