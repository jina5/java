package test1;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력:");
		int n=sc.nextInt();
		int sum=0;
		
//내가한것	(틀림)
//		for(int i=1;i<n&&n%i==0;i++) { n%1==0이 &&로 묶여있으면 이거 하나라도 만족 안하면 반복 끊김
			// 밑에 if로 내려야함 
//			sum+=i;
//		}

		for(int i=1; i<n;i++) {
			if(n%i==0) //약수구하기
				sum+=i; //구한 약수의 합
		}
		if(sum==n) 
			System.out.println("완전수 입니다.");
		else
			System.out.println("완전수가 아닙니다.");

	}

}
