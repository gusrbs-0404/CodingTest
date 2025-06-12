package Level3;

import java.util.Random;

public class Class9 {
    public static void main(String[] args) {
        // 상수
        Random rand = new Random();

        int a = rand.nextInt(900) + 100;
        int b = rand.nextInt(900) + 100;

        System.out.println("변경전");
        System.out.println(a + " " + b);

        // 문자열로 바꾸고 StringBuilder의 .reverse() 메서드 활용후 .toString()으로 다시 일반 문자열로 바꿈
        String reversedA = new StringBuilder(String.valueOf(a)).reverse().toString();
        String reversedB = new StringBuilder(String.valueOf(b)).reverse().toString();

        int intA = Integer.parseInt(reversedA);
        int intB = Integer.parseInt(reversedB);

        System.out.println("변경후");
        System.out.println(intA + " " + intB);

        if (intA > intB) {
            System.out.println("뒤집은 수 중 큰 값 : " + intA);
        } else {
            System.out.println("뒤집은 수 중 큰 값 : " + intB);
        }
    }
}
