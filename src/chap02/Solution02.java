package chap02;

import java.util.Scanner;

public class Solution02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력: 시험 점수를 입력받음
        int score = scanner.nextInt();

        // 성적을 판단하고 출력
        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 80 && score < 90) {
            System.out.println("B");
        } else if (score >= 70 && score < 80) {
            System.out.println("C");
        } else if (score >= 60 && score < 70) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        scanner.close();
    }
}

