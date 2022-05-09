import java.util.Scanner;

public class SwitchQuest {
	/*
	 * 점수 하나를 입력 받아서 100~90A 89~80B 79~70C 69~60D 59~0F 성적등급 출력 switch이용
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 >>> ");
		int score = sc.nextInt();

		switch (score/10) {
		case 10: //case 옆의 값은 중복되지않고 고유값이어야한다.
		case 9: //10, 9일때 같은 결과 원함 ( break 없이)
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default: //else
			System.out.println("F");
			break;
		}
	}

}
