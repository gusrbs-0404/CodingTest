package Level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Class4_1 {
    public static void main(String[] args) throws IOException {
        // 2751번 수 정렬하기 2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 갯수 입력 받기
        int N = Integer.parseInt(br.readLine());

        // 1 처럼 기존 방식대로하면 시간초과가 뜬다
        // Collections.sort() 사용해서 풀어야한다
        // 추가내용
        // 1. Shell Sort (셸 정렬)
        // 2. Heap Sort (힙 정렬)
        // 3. Merge Sort (합병/병합 정렬)
        // 4. Tim Sort (팀 정렬)

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for(int value : list) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
}
