package Level0;

import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        // 두 수 비교
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 숫자 : ");
        int a = sc.nextInt();

        System.out.print("두번째 숫자 : ");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("A와 B는 같다.");
        } else if (a > b) {
            System.out.println("A가 B보다 크다.");
        } else {
            System.out.println("A는 B보다 작다.");
        }
    }
}
