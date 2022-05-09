import java.util.Scanner;

public class ForEx2 {
	/*
	 * 정수하나 입력을 받아서 입력받은 정수에 해당하는 구구단을 출력
	 * 
	 * 정수 입력 :3
	 * 3*1=3
	 * .
	 * .
	 * 3*9=27
	 * WhileQuest3에서 작성한 while문을 For문으로 변경
	 * 
	 */
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 입력: ");
			int n = sc.nextInt();
			
			for (int m=1;m<10;m++) {  //지역변수 : 변수선언을 for 안에서 하면 for문이 끝나면 변수 사라짐
				System.out.println(n+"*"+m+"="+(n*m));
		

	}

}}
