package Level7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Class3 {
    public static void main(String[] args) {
        // 9506 약수들의 합
        Scanner sc = new Scanner(System.in);

        while (true) {
            int N = sc.nextInt();

            if(N == -1) {
                System.out.println(N);
                break;
            }

            List<Integer> list = new ArrayList<>();

            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    list.add(i);
                }
            }

            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }

            if(sum == N){
                System.out.print(N + " = ");
                for (int i = 0; i < list.size(); i++) {
                    System.out.print(list.get(i));
                    if (i != list.size() - 1) {
                        System.out.print(" + ");
                    }
                }
                System.out.println();
            } else {
                System.out.println(N + " is NOT perfect.");
            }
        }

    }
}
