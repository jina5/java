import java.util.Scanner;

public class ElseIfQuest {
	/*
	 * 점수 하나를 입력 받아서 100~90A 89~80B 79~70C 69~60D 59~0F 성적등급 출력
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 >>> ");
		int score = sc.nextInt();

		char grade = 'F';
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			System.out.println(grade + "등급 입니다.");
		}
		
		// if에 문장 다 넣는것보다 수정사항이 생겼을 때 반영하기가 더 쉬움

	}

}
