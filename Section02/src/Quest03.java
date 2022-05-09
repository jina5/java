//삼항연산, scanner

import java.util.Scanner;

public class Quest03 {
	/*
	 * 정수 하나를 입력 받은 후 
	 * 인력 받은 정수가 홀수이면 홀수라고 출력, 짝수면 짝수라고 출력
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("정수 : ");
		int n = sc.nextInt(); 
		String str1 = "짝수";
		String str2 = "홀수";
		String result = n%2==0? str1 : str2;
		System.out.println(result);  //처음 만든것
	
		System.out.print("정수 : ");
		int m = sc.nextInt(); 
		String result2 = m%2==0? "짝수" : "홀수";
		System.out.println(result2); //두번째 만든것
		
		System.out.print("정수 : ");
		int d = sc.nextInt(); 
		System.out.println(d%2==0? "짝수" : "홀수"); //더 짧게 가능
		
	}

}
