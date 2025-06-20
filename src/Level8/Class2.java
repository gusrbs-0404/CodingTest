package Level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Class2 {
    public static void main(String[] args) throws IOException {
        // 1085번 직사각형에서 탈출
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st1.nextToken());
        int y = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st2.nextToken());
        int h = Integer.parseInt(st2.nextToken());

        br.close();

        int xmin = Math.min(x, w - x);
        int ymin = Math.min(y, h - y);

        System.out.println(Math.min(xmin, ymin));
    }
}
