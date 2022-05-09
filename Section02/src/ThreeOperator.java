//삼항연산자
public class ThreeOperator {

	public static void main(String[] args) {
		int n1=30, n2=20;
		int result= n1>n2 ? n1-n2 : n2-n1; //삼항연산자
		// ? 앞의 조건식이 true면 콜론 기준 왼쪽만 실행, false면 오른쪽만 실행 후 저장
		// 조건에 따라 실행되는 값이 달라진다.
		
		System.out.println(result);

	}

}

