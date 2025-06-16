package Level5;

import java.util.Random;

public class Class2 {
    public static void main(String[] args) {
        // 최댓값
        Random rand = new Random();

        int arr[ ][ ] = new int[9][9];
        int max = 0;
        int maxX = 0;
        int maxY = 0;

        // 값 넣기
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(99);
            }
        }

        // 최댓값 찾기
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    maxX = j + 1;
                    maxY = i + 1;
                }
            }
        }

        // 출력
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("max : " + max);
        System.out.println("X Y : " + maxX + " " +maxY);
    }
}
