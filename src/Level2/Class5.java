package Level2;

import java.util.Arrays;
import java.util.Scanner;

public class Class5 {
    public static void main(String[] args) {
        // 공 넣기
        Scanner sc = new Scanner(System.in);

        System.out.print("바구니 개수 : ");
        int n = sc.nextInt();

        System.out.print("넣을 공 개수 : ");
        int m = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("첫번째 바구니 : ");
        int i = sc.nextInt();
        System.out.print("두번쨰 바구니 : ");
        int j = sc.nextInt();
        System.out.print("넣을 공 번호 : ");
        int k = sc.nextInt();

        for (int z = 1; z <= m; z++) {
            for (int x = i; x <= j; x++) {
                arr[x] = k;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
