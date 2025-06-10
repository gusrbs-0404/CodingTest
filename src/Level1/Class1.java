package Level1;

import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        // 구구단
        Scanner sc = new Scanner(System.in);
        System.out.print("구구단 N단 입력 : ");
        int n = sc.nextInt();

        for (int i=1; i<=9; i++) {
            System.out.println(n + " x " + i + " = " + (n*i));
        }
    }
}
