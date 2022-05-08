import java.util.Scanner;

public class ForQuest1 {
	/*
	 * 숫자 두개를 입력받은 후 입력된 숫자들 중작은 숫자부터 큰 숫자까지의 합을 출력
	 * 
	 * 숫자 입력 : 1 숫자 입력 : 100 합 : 5050
	 */
	public static void main(String[] args) {
		// 정수 2개 입력 후 변수에 저장
		// 합을 저장할 정수형 변수 선언
		// 큰숫자 작은 숫자를 구분해서 저장 (주의 ☆)
		// 반복문:작은 숫자부터 큰 숫자까지 반복
		// 숫자를 합에다가 누적, 총합을 출력

		Scanner sc = new Scanner(System.in);
		// 정수 2개 입력 후 변수에 저장
		System.out.print("숫자 입력: ");
		int n = sc.nextInt();
		System.out.print("숫자 입력: ");
		int m = sc.nextInt();
		// 합을 저장할 정수형 변수 선언
		int total = 0;
		// 큰숫자 작은숫자 구분해서 저장 (이거 빼먹었었음)
		if (n > m) {
			int temp = n; // n이 m보다 크면 변수 교환 (무조건 n이 작은 값)
			n = m;
			m = temp;
		}
		// 반복문:작은 숫자부터 큰 숫자까지 반복
		// 숫자를 합에다가 누적
		for (; n < m + 1; n++) 
			total += n; //한줄이라 {} 안써도 됨
		
		// 총합을 출력
		System.out.println("합 : " + total);
	}

}
