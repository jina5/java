//변수
public class VariableEx {
/* 
 * 데이터 형태 - 정수 실수 문자 논리
 * 정수 : 양수음수0
 * 실수 : 소수점이 추가 된 형태
 * 문자 : 한글자
 * 논리 : 참(true), 거짓(false)
 *
 * 변수(Variable):데이터를 하나 저장할 공간
 * 
 * 변수 선언 방법
 * 변수타입 변수명;
 * 정수형 변수
 * 
 * 변수명 만드는 규칙
 * 1. 중복 안됨 
 * 2. 대소문자 구분 
 * 3. 변수명에 사용가능한 문자 : 알파벳 대소문자, 숫자, _, $ ($는 자바라서 가능)
 * 4. 키워드와 동일하게 변수명을 쓸 수 없음 (int 이런거 안됨)
 * 5. 변수명 첫글자로는 숫자가 올 수 없음 (첫글자: 알파벳, _, $)
 * 
 */
	public static void main(String[] args) {
	int num;//num이라는 이름으로 정수형 데이터를 하나 저장할 공간을 임대 받았다.
	//변수 생성
	num=100;//100을 변수 num에 저장하겠다.
	//초기화(initialize, init) : 변수를 만든 후에 데이터를 저장하는 행위
	System.out.println(num);
	
	//변수 선언하자마자 초기화
	int age=30;
	System.out.println(age);
	
	//정수형 변수 3개를 선언한 후 데이터를 각각 10,20,30으로 초기화
	// , : 변수나 데이터 구분
	int n1=10, n2=20, n3=30;
	System.out.println(n1);
	System.out.println(n2);
	System.out.println(n3);
	
	// sysout 에는 줄바꿈 포함되어있음 = 출력 후 줄바꿈
	// 문자열+덧셈 = 문자열
	// 한줄에 데이터 표시하고 싶을때
	System.out.println(n1+","+n2+","+n3);
	
	int box = 10;
	box = 20; //마지막에 저장된 데이터만 남아있음
	System.out.println(box); //20으로 출력
	

	}

}
