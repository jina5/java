//scanner
import java.util.Scanner;

public class Quest02 {

	public static void main(String[] args) {
		/* 
		 * 반지름 하나를 입력 받은 후 
		 * 입력 받은 반지름 값을 이용하여 해당 원넓이를 출력
		 *
		 */
		
		Scanner sc = new Scanner(System.in); // 이건 한번만 입력하기
		System.out.print("반지름 입력 : ");
		int r = sc.nextInt(); 
		System.out.println("원넓이 :"+(3.1415*r*r));
		
	}

}
