package Level11;

import java.util.Arrays;
import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        // 2750번 수 정렬하기
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int N = sc.nextInt();

        // 값 넣기
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // 1. 선택 정렬
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        // 2. 메소드로 정렬
        Arrays.sort(arr);

        // 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
