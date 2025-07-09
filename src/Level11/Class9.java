package Level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Class9 {
    public static void main(String[] args) throws IOException {
        // 1181번 단어 정렬
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N개 입력 받기
        int N = Integer.parseInt(br.readLine());

        // 배열 초기화
        String[] str = new String[N];

        // 단어 입력 받기
        for (int i = 0; i < N; i++) {
            str[i] = br.readLine();
        }

        // 중복제거
        String[] result = Arrays.stream(str).distinct().toArray(String[]::new);

        // 람다식을 사용한 정렬
        Arrays.sort(result, (s1, s2) -> {
            if (s1.length() == s2.length()) {
                // 길이가 같으면 사전순
                return s1.compareTo(s2);
            } else {
                // 길이가 다르면 길이순
                return s1.length() - s2.length();
            }
        });

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
