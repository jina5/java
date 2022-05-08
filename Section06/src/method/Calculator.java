package method;

import java.util.Scanner;

/*
 * method : 클래스에서 가지고 있는 기능에 해당하는 부분
 * 			미리 만든 기능 (다른 언어에서는 함수)
 * 
 * 매개변수 있는 경우, 없는 경우
 * 리턴(결과값) 주는경우, 아닌 경우
 */
public class Calculator {
	int n1;
	int n2;
	
	//숫자 두개 입력 받아서 필드를 초기화 메서드 (매개변수X, 리턴X)
	//void : 변수타입, 메모리할당할 수 있는 형태가 아니라 리턴값 없음
	//void->결과값 없다

	void inputNumber() { 
		//매개변수X 리턴X
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		n1= sc.nextInt();
		System.out.println("숫자 입력 : ");
		n2= sc.nextInt();
	}
	
	
	//필드를 전부 더한 결과값을 리턴 메서드
	//리턴타입이 void가 아니면 리턴(결과값) 나온다

	int sum() { //리턴타입 : 결과값 정수(int)여야 한다
		//매개변수X 리턴O
		int result = n1+n2;
		return result; //
	}
	
	//외부에서 n1,n2 값을 받아오는 메서드
	void init(int num1, int num2) {
		//매개변수(받아오는 값)O 리턴X
		n1= num1;
		n2=num2;
	}
	
	//두개의 정수를 받아서 두 수의 뺄셈 결과를 리턴하는메서드
	int minus(int i, int j) {
		//매개변수O 리턴O
		return i-j;
	}
	

}
