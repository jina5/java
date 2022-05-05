//숫자입력기능

import java.util.Scanner;//java폴더의 util폴더에 있는 scanner 파일 읽어오겠다
//자바 객체지향:절차지향(일하는 순서 중요)만으로는 문제해결 어려움, 일을하는 대상이 중요!

public class InputNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력하세요 : ");//println은 출력후 엔터 포함, print는 줄바꿈 없음
		int n = sc.nextInt(); //nextInt() : 정수하나 입력받음 -> n에 저장한다.
		System.out.println(n);
	//프로그램 실행 상태(빨간색네모)일 때 콘솔창에 숫자쓰면 숫자 출력됨
	
				
	}

}
