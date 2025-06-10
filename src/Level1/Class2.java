package Level1;

import java.util.Random;
import java.util.Scanner;


public class Class2 {
    public static void main(String[] args) {
        // A + B - 3
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("반복할 테스트 개수 : ");
        int x = sc.nextInt();

        for(int i=0; i<x; i++) {
            int a = rand.nextInt(10) + 1;
            int b = rand.nextInt(10) + 1;

            System.out.println(a + "+" + b + "=" + (a + b));
        }
    }
}
