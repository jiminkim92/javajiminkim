package loop;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 1~10 중 짝수만 출력하기
		// for(초기값;조건식;증감량){반복할 코드;}
		for (int i = 1; i <= 10; ++i) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		// 2. 정수형태 비밀번호 맞추기 (기회는 5번, 맞추면 맞췄다!, 기회를 모두 사용하면 접속불가)
		int pwd = 1234;
		int user_input = 0;

		for (int i = 0; i < 5; ++i) {
			System.out.println("비밀번호를 입력하세요>>");
			user_input = sc.nextInt();
			if (user_input == pwd) {
				System.out.println("맞았습니다!");
				break;
			}

			if (i == 4) {
				System.out.println("접속불가");
			}
		}
		

	}
}
