package Level1;

import java.util.Scanner;

public class Class3 {
    public static void main(String[] args) {
        // 합
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력(1 ~ 10,000) : ");
        int n = sc.nextInt();

        if(n >= 1 && n <= 1000) {
            int sum = 0;
            while (n != 0){
                sum = sum + n;
                n--;
            }
            System.out.println("총합 : " + sum);
        } else {
            System.out.println("범위 잘못 입력!");
        }
    }
}
