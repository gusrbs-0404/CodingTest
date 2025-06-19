package Level7;

import java.util.ArrayList;
import java.util.Scanner;

public class Class5 {
    public static void main(String[] args) {
        // 2581 소수
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = M; i <= N; i++){
            int count = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    count++;
                }
            }

            if(count == 2){
                list.add(i);
            }
        }

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        if(sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(list.get(0));
        }

    }
}
