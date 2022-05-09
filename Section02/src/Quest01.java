//산술연산자
import java.util.Scanner;

public class Quest01 {

	public static void main(String[] args) {
	
	/* 정수형 변수 2개를 선언 한 후
	 * 정수 2개를 각각 입력을 받은 후
	 * 해당 변수 2개를 이용하여 모든 사칙연산의 결과를 출력 
	 */

		Scanner sc = new Scanner(System.in); // 이건 한번만 입력하기
		System.out.print("정수 입력 : ");
		int n = sc.nextInt(); 
		System.out.print("정수 입력 : ");
		int m = sc.nextInt(); 
		System.out.println(n+m);
		System.out.println(n-m);
		System.out.println(n*m);
		System.out.println(n/m);
		System.out.println(n%m);
	}

}
