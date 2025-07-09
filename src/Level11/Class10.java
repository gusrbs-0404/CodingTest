package Level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Class10 {

    // 1. 나이와 이름을 함께 저장할 Member 클래스를 정의합니다.
    public static class Member {
        int age;
        String name;

        public Member(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }

    public static void main(String[] args) throws IOException {
        // 10814번 나이순 정렬
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 배열 생성
        Member[] members = new Member[N];

        // 나이, 이름을 입력받아 Member 객체로 만들어 배열에 저장
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            members[i] = new Member(age, name);
        }

        // Comparator를 사용해 나이(age)를 기준으로 배열을 정렬
        // 나이가 같으면 입력 순서가 유지
        Arrays.sort(members, new Comparator<Member>() {
            @Override
            public int compare(Member m1, Member m2) {
                return m1.age - m2.age; // 나이 오름차순으로 정렬
            }
        });

        // 정렬된 결과를 출력
        StringBuilder sb = new StringBuilder();
        for (Member member : members) {
            sb.append(member.age).append(' ').append(member.name).append('\n');
        }
        System.out.print(sb);
    }
}