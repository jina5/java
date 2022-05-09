import java.util.Scanner;

public class IfQuest {
	/*
	 * 숫자 하나를 입력 받은 후 
	 * 숫자가 홀수이면 홀수라고 출력, 짝수면 짝수라고 출력
	 */
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 
		System.out.print("숫자 : ");
		int n = sc.nextInt(); 
	
		if(n%2==0) {
			System.out.println("짝수입니다.");
		}
		if(n%2!=0) {
			System.out.println("홀수입니다.");  //이렇게 되면 조건을 둘다 확인하니까.. 조건문 줄이는게 좋음
		}
	
	
	
	
	}

}
