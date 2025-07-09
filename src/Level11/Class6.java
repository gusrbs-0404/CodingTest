package Level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class6 {
    public static void main(String[] args) throws IOException {
        // 1427번 소트인사이드
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N입력받기
        String N = br.readLine();

        // 배열 초기화
        int[] arr = new int[N.length()];

        // 배열에 값 넣기
        for(int i =0; i<N.length(); i++){
            arr[i] = Integer.parseInt(N.substring(i,i+1));
        }

        // 배열 정렬
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
