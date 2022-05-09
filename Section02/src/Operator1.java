//연산

public class Operator1 {
	/*
	 * 산술연산자 (숫자계산, 계산해서 결과값을 내는것)
	    사칙연산자, 복합대입연산자, 증감연산자
	   조건연산자 (결과가 true, false로 나옴:boolean으로 저장)
	    관계연산자(부등식, 상황 1개 확인), 논리연산자(and or not,조건 2개이상 확인) 
	
	 * 사칙연산 - 덧셈 + 뺄셈 - 곱셈 * 
	 *          나눗셈 / (몫 - 정수 계산일 때, 소수점 - 실수 계산일 때) 
	 *          나눗셈 % (나머지 - 정수계산만)
	 * = 대입연산자
	 * 
	 * 연산자 우선순위
	 * result = n1+10>5 && ++n2*19>=20
	 * () -> 증감연산자(++ --) -> 사칙연산자 -> 관계연산자(부등식) -> 논리연산자(&& || !) -> 대입연산자 
	 * 
	 */
	
	public static void main(String[] args) {
	//정수형 변수 2개 선언, 변수명 자유롭게, 각각 5,3으로 변수 초기화
		int n1=5, n2=3; 
		System.out.println(n1+n2);
		System.out.println(n1-n2);
		System.out.println(n1*n2);
		System.out.println(n1/n2);//몫 1
		System.out.println(n1%n2);//나머지 2
	//계산만 하는거는 n1, n2 데이터 바뀌는 것이 아님.
	//정수와 정수를 계산하면 결과값으로 정수가 나온다.
	//정수와 실수를 계산하면 실수가 나온다. (정수->실수 autocasting)
	
		
		// 계산한 결과를 변수에 저장
		int result = 0;
		result = n1+n2; 
		// result에 식을 저장하는게 아니고, 계산된 결과값을 result에 저장한다.
		// n1,n2 값은 변경사항 없음
		// 대입연산자 = 는 사칙연산자보다 후순위
		// n2=100; -> 식을 저장했다면 105가 나오겠지만
		System.out.println(result); //결과값이 저장되었기 때문에 8
		result = n1*n2;
		System.out.println(result); //15
		
		// 정수와 실수를 계산하면 정수가 실수로 형변환이 됨
		double d=12.456;
		System.out.println(n1*d);
		System.out.println(d/n1);//결과값 실수
		
// 소수점 계산할 때 기준 잡는 것 주의하기
		System.out.println((int)(1.5*3));//1.5*3=4.5 -> 정수변환 4
		System.out.println((int)1.5*3);//1.5정수변환->1 1*3=3

// 파이썬에서는 / 나누면 소수점까지 다 나오고 몫 구하는 것 따로있음..	

	}

}
