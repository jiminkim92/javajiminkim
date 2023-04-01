package cls;

import javax.print.DocFlavor.STRING;

public class Class3 {
	public static void main(String[] args) {
		// 아빠차, 엄마차, 내차
		자동차 아빠차 = new 자동차();
		자동차 엄마차 = new 자동차();
		자동차 내차 = new 자동차();
		
		아빠차.차주인 = "아빠";
		아빠차.차종 = "카니발";
		아빠차.차색상 = "블랙";
		
		내차.차주인 = "나";
		내차.차종 = "E220 AMG";
		내차.차색상 = "화이트";
		
		아빠차.차정보();
		내차.차정보();
		엄마차.차정보();		// 값을 안담고 사용하면 버그 발생
		
	}
}

// class 자동차
// 데이터 : 차주인, 차종, 차색상
// 기능 : 차정보(주인이 누구인지, 차종은 무엇인지, 차색상은 무엇인지 안내해주는 출력)
class 자동차{
	// 데이터를 담기 위해선 변수가 필요
	String 차주인;
	String 차종;
	String 차색상;
	
	// 기능제공을 위해선 메서드를 만든다
	void 차정보() {
		System.out.println("주인 : "+차주인+", 차종 : "+차종+", 차색상: "+차색상);
	}
}