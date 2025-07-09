package Level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Class11 {
    public static void main(String[] args) throws IOException {
        // 18870번 좌표 압축
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 원본 좌표를 저장할 배열 최기화
        int[] arr = new int[N];
        
        // 정렬에 사용할 배열 초기화
        int[] result = new int[N];

        // 입력받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int coord = Integer.parseInt(st.nextToken());
            arr[i] = coord;
            result[i] = coord;
        }

        // 배열 정렬
        Arrays.sort(result);

        // 각 좌표의 "순위"를 매기기
        HashMap<Integer, Integer> rankingMap = new HashMap<>();
        int rank = 0;
        for (int coord : result) {
            // 맵에 해당 좌표가 아직 없으면 새로운 순위를 부여하고 맵에 추가
            if (!rankingMap.containsKey(coord)) {
                rankingMap.put(coord, rank);
                rank++; // 다음 좌표는 다음 순위를 가짐
            }
        }

        // 출력
        StringBuilder sb = new StringBuilder();
        for (int key : arr) {
            int compressedValue = rankingMap.get(key);
            sb.append(compressedValue).append(' ');
        }

        System.out.println(sb);
    }
}