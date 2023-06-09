package review;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		// 3. 시험학격 점수는 국어,영어,수학이 각각 40점 이상이고, 총점수가 150점 이상이면 합격
		// 40점 이하의 점수가 있으면 과락, 각 과목이 40점 이상이나 총점이 미달되면 총점미달(if문)

		// 테스트케이스
		/*
		 * 39, 40, 40 ==> 과락 39, 40, 100 ==> 과락 40, 40, 40 ==> 총점 미달 40, 40, 100 ==> 합격
		 */
		int 국어 = 40;
		int 영어 = 40;
		int 수학 = 40;
		int 총점수 = 0;

		총점수 = 국어 + 영어 + 수학;

		if (국어 >= 40 && 영어 >= 40 && 수학 >= 40) {
			// 과락x
			if (총점수 >= 150) {
				System.out.println("합격");
			} else {
				System.out.println("총점 미달");
			}
		} else {
			System.out.println("과락");
		}

		// 4. 1~10까지의 합 구하기(반복문)
		/* 55 */
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);

		// 5. 10~1까지 거꾸로 출력하기(반복문)
		/* 10 9 8 7 6 5 4 3 2 1 */
		for (int i = 10; i >= 1; --i) {
			System.out.print(i + " ");
		}

	}
}
