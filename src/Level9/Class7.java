package Level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Class7 {
    public static void main(String[] args) throws IOException {
        // 24313번 점근적 표기 1

        // 함수 f(n)=a₁·n + a₀, g(n)=n과 상수 c, n₀가 주어질 때
        // 모든 n ≥ n₀에 대해 f(n) ≤ c·g(n)을 만족하면 1, 아니면 0

        // a₁·n + a₀ ≤ c·n  ⇔  a₀ ≤ (c – a₁)·n
        // 이므로 c > a₁인 경우 (c – a₁)·n은 n이 커질수록 증가해 최소값이 n = n₀에서 발생!
        // 또한 c = a₁인 경우 (c – a₁)·n = 0이므로 a₀ ≤ 0인지 확인하면 되고, c < a₁이면 기울기가 커서 결국 성립하지 않음.
        // 따라서 ① a₁ ≤ c인지,
        //       ② n = n₀일 때 a₁·n₀ + a₀ ≤ c·n₀인지 검사하면 충분!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st2.nextToken());
        int a0 = Integer.parseInt(st2.nextToken());

        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());
        br.close();

        if (a1 <= c && a1 * n0 + a0 <= c * n0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
