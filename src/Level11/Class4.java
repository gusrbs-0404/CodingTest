package Level11;

import java.io.*;

public class Class4 {
    public static void main(String[] args) throws IOException {
        // 2751번 수 정렬하기 2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 갯수 입력 받기
        int N = Integer.parseInt(br.readLine());



        // 1 처럼 기존 방식대로하면 시간초과가 뜬다
        // Collections.sort() 사용해서 풀어야한다
        // 추가내용
        // 1. Shell Sort (셸 정렬)
        // 2. Heap Sort (힙 정렬)
        // 3. Merge Sort (합병/병합 정렬)
        // 4. Tim Sort (팀 정렬)

//        // 값 입력 받기
//        int[] arr = new int[N];
//        for (int i = 0; i < N; i++) {
//            arr[i] = Integer.parseInt(br.readLine());
//        }
//
//        // 오름차순 정렬
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = temp;
//                }
//            }
//        }
//
//        // 출력
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }



    }
}
