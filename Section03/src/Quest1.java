import java.util.Scanner;

public class Quest1 {

	/* 
	 * 숫자 두개를 입력해서 두 숫자의 뺄셈 결과를 무조건 양수로 출력
	 * (삼항연산자 이용했던 문제)
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1 : ");
		int n1 = sc.nextInt();
		System.out.print("숫자2 : ");
		int n2 = sc.nextInt();
		
//내가 한것		
		if (n1>n2) {System.out.println(n1-n2);
		}
		else System.out.println(n2-n1);
		
//다른 방법		
		int result = n1-n2; 
		if (result<0) {
			result=-result; //-result값을 result에 저장
			System.out.println(result);
		}
//다른 방법
		if(n1<n2) {  // 데이터 동시에 교환하는 방법은 없다, 하나씩 교체해야 한다.
		int temp=n1; // n1값을 임시변수 temp로 이동
		n1=n2; //n2값을 n1으로
		n2=temp; //temp에 있던 n1값을 n2로
		}
		//실행 끝나면 {}안의 명령은 소멸, temp 변수는 사라짐
		
		System.out.println(n1-n2);
	}

}
