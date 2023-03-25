package condition;

import java.util.Scanner;

public class Ifelse3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 변수 = sc.nextInt();
		
		// 1. 20세 이상이면 성인, 14~20세는 청소년, 14세 미만은 어린이로 구분
		System.out.println("나이를 입력하세요: ");
		int age = 20;
		age = sc.nextInt();
		if(age >= 20) {
			System.out.println("성인");
		}else if(age < 20 && age > 14) {
			System.out.println("청소년");
		}else if(age < 14) {
			System.out.println("어린이");
		}else {
			System.out.println("그 밖에");
		}
	
		
		
		// 2. 학점 계산(90이상은 A, 80이상은 B, 70이상은 C, 그 미만은 F)
		System.out.println("학점을 입력하세요: ");
		int score = sc.nextInt();
		if(score >= 90) {
			System.out.println("A");
		}else if(score >= 80) {
			System.out.println("B");
		}else if(score >= 70) {
			System.out.println("C");
		}else if(score < 69) {
			System.out.println("F");		
		}else {
			System.out.println("그 밖에");
		}
		
		// 3. 비밀번호를 정해놓고 사용자가 비밀번호를 입력해서 맞추면 '비밀번호가 맞습니다.'
		// 틀리면 '비밀번호가 다릅니다.'
		int key = 1234;		//정답 비밀번호
		System.out.println("비밀번호를 입력하세요: ");
		int password = sc.nextInt();
		if(key == password) {
			System.out.println("비밀번호가 맞습니다");
		}else {
			System.out.println("비밀번호가 다릅니다");
		}
		
		
			
		}
}

