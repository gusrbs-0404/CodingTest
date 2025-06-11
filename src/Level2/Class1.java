package Level2;

import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        // 개수 세기
        Scanner sc = new Scanner(System.in);

        int[] array = {1, 4, 1, 2, 4, 2, 2, 2, 3, 4, 4};

        System.out.print("숫자 입력 (1~4) : ");
        int num = sc.nextInt();

        if (num < 1 || num > 4) {
            System.out.println("숫자 잘못입력!");
        }

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == num) {
                count ++;
            }
        }

        System.out.println("총 개수 : " + count);
    }
}
