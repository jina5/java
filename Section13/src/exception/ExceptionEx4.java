package exception;

import java.util.Scanner;

public class ExceptionEx4 {

//	public static int div(int n1, int n2) {
//		int result = -1;
//		try {
//			result = n1 / n2;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return result;
// 		result가 try{}안에 있으면 지역변수가 되어서, try 영역 끝나면 사라짐.
// 		-1은 실제 결과값으로 나올수도있기때문에 에러와 구분이 명확하지않음.
//	}

	public static int div(int n1, int n2) throws ArithmeticException {
		return n1 / n2;
	} //arithemicException 발생하면 일 시킨 부분이 책임! 일 시킨 부분(div)이 try, catch 포함해야함

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 : ");
		int n1 = sc.nextInt();
		System.out.println("숫자입력 : ");
		int n2 = sc.nextInt();
		try {
			System.out.println(div(n1,n2));			
		} catch (ArithmeticException e ) { //ArithmeticException:0으로 나누면 발생하는 에러
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");

	}

}
