//반복문 중첩가능 (while안에 while)
public class WhileInWhile {

	public static void main(String[] args) {
		int n = 2, m = 1;
		while (n < 10) {
			System.out.println(n+"단");
			m=1; //중첩된 반복문을 실행하기 전에 제어 변수 초기화 (지역변수)
			{while (m<10) {
				System.out.println(n+"*"+m+"="+(n*m));
				 m++;
			}
			n++;
			}

	}

}}
