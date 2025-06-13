package Level4;

import java.util.Arrays;
import java.util.Scanner;

public class Class2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] chess = {1, 1, 2, 2, 2, 8};

        System.out.println("킹, 퀸, 룩, 비숍, 나이트, 폰 개수 : ");
        String s = sc.nextLine();

        // String -> int
        String[] input = s.split(" ");

        int[] input2 = new int[input.length];
        for (int i = 0; i < input2.length; i++) {
            input2[i] = Integer.parseInt(input[i]);
        }

        // 결과
        int[] count = new int[chess.length];
        for (int i = 0; i < chess.length; i++) {
            count[i] = chess[i] - input2[i];
        }

        System.out.println("결과");
        System.out.println(Arrays.toString(count));
    }
}
