package Level2;

import java.util.Scanner;

public class Class8 {
    public static void main(String[] args) {
        // 나머지
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        for (int i=0; i<arr.length; i++) {
            System.out.print((i+1) + "번 숫자 입력 : ");
            String num = sc.nextLine();
            arr[i] = Integer.parseInt(num);
        }

        System.out.print("나눌 숫자 입력 : ");
        String num = sc.nextLine();

        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " % " + num + " = ");
            System.out.println(arr[i] % Integer.parseInt(num));
        }
    }
}
