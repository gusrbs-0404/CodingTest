package Level5;

public class Class3 {
    public static void main(String[] args) {
        // 세로읽기
        String[][] arr = {
                {"A","B","C","D","E"},
                {"a","b","c","d","e"},
                {"0","1","2","3","4"},
                {"F","G","H","I","J"},
                {"f","g","h","i","j"}
        };

//        String[][] arr = {
//                {"A","A","B","C","D","D"},
//                {"a","f","z","z"},
//                {"0","9","1","2","1"},
//                {"a","8","E","W","g","6"},
//                {"P","5","h","3","k","x"}
//        };

        // 결과값
        StringBuilder result = new StringBuilder();

        // 세로로 값 넣기
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result.append(arr[j][i]);
            }
        }

        // 출력
        System.out.println(result);


    }
}
