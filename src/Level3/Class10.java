package Level3;

import java.util.Scanner;

public class Class10 {
    public static void main(String[] args) {
        //다이얼 ??
        Scanner sc = new Scanner(System.in);

        System.out.print("문자 입력 : ");
        String s = sc.nextLine();

        int count = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {

            switch (s.charAt(i)) {
                case 'A' : case 'B' : case 'C' :
                    count += 3;
                    break;
                case 'D' : case 'E' : case 'F' :
                    count += 4;
                    break;
                case 'G' : case 'H' : case 'I' :
                    count += 5;
                    break;
                case 'J' : case 'K' : case 'L' :
                    count += 6;
                    break;
                case 'M' : case 'N' : case 'O' :
                    count += 7;
                    break;
                case 'P' : case 'Q' : case 'R' : case 'S' :
                    count += 8;
                    break;
                case 'T' : case 'U' : case 'V' :
                    count += 9;
                    break;
                case 'W' : case 'X' : case 'Y' : case 'Z' :
                    count += 10;
                    break;
            }
        }
        System.out.println(count);
    }
}
