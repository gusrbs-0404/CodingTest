package Level10;

import java.util.Scanner;

public class Class5 {
    public static void main(String[] args) {
        // 1436번 영화감독 숌
        // 틀린이유
        // 6660 6661 6662 6663 .. 생각을 안하고 풀었다.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int num = 666;
        int count = 1;

        while(count != N) {
            num++;
            if(String.valueOf(num).contains("666")) {
                count++;
            }
        }
        System.out.println(num);
    }
}
