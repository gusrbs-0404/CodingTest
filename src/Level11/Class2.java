package Level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Class2 {
    public static void main(String[] args) throws IOException {
        // 2578번 대표값2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 값 넣기
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 합 구하기
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        // 평균 구하기
        int avg = sum / arr.length;

        // 정렬하기
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // 출력
        System.out.println(avg);
        System.out.println(arr[2]);

    }
}
