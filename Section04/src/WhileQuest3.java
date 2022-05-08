import java.util.Scanner;

public class WhileQuest3 {

	/*
	 * 정수하나 입력을 받아서 입력받은 정수에 해당하는 구구단을 출력
	 * 
	 * 정수 입력 :3
	 * 3*1=3
	 * .
	 * .
	 * 3*9=27
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
//내가한것
		int m=1;
		while (m<10) {
			System.out.println(n+"*"+m+"="+(n*m));
			m++;
		}
		

	}

}
