package Level8;

import java.util.Scanner;

public class Class4 {
    public static void main(String[] args) {
        // 15894번 수학은 체육과목 입니다.
        // 틀린 이유 
        // 1. n 범위가 int 범위를 초과서 틀렸다.
        // int -> long 으로 수정
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();

        System.out.println(n * 4);
    }
}
