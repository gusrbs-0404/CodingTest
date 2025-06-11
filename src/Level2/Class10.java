package Level2;

public class Class10 {
    public static void main(String[] args) {
        // 평균
        int[] arr = {40, 80, 60};

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            double newScore = (double) arr[i] / max * 100;
            sum += newScore;
        }

        double avg = sum / arr.length;

        System.out.println("시험 평균 점수 : " + avg);
    }
}
