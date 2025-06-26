package Level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Class4 {
    public static void main(String[] args) throws IOException {
        // 1018번 체스판 다시 칠하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] board = new char[N][M];

        // 보드 입력
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        // 모든 8×8 시작점 검사하며 최소 재칠 횟수 갱신
        int minRepaint = Integer.MAX_VALUE;
        for (int si = 0; si <= N - 8; si++) {
            for (int sj = 0; sj <= M - 8; sj++) {
                minRepaint = Math.min(minRepaint,
                        countByPattern(board, si, sj, PATTERN_BLACK));
                minRepaint = Math.min(minRepaint,
                        countByPattern(board, si, sj, PATTERN_WHITE));
            }
        }

        System.out.println(minRepaint);
    }

    private static final char[][] PATTERN_BLACK = {
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'}
    };

    private static final char[][] PATTERN_WHITE = {
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'}
    };

    private static int countByPattern(char[][] b, int si, int sj, char[][] pattern) {
        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (b[si + i][sj + j] != pattern[i % 2][j]) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
