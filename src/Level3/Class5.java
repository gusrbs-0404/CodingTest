package Level3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Class5 {
    public static void main(String[] args) {
        // 숫자의 합
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("숫자 개수 : ");
        int a = sc.nextInt();
        
        // 값 넣기
        int[] n = new int[a];
        for (int i = 0; i < a; i++) {
            n[i] = rand.nextInt(10) + 1;
        }
        
        // 합 구하기
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i]; 
        }
        
        System.out.println(Arrays.toString(n));
        System.out.println("총합 : " + sum);
        
        
        
    }
}
