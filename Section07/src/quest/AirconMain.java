package quest;

import java.util.Scanner;

public class AirconMain {

	public static void main(String[] args) {
		Aircon air = new Aircon();
		Scanner sc = new Scanner(System.in);
		while (true) { //무한루프
			System.out.println("1-에어컨전원");
			System.out.println("2-운전선택");
			System.out.println("3-바람세기");
			System.out.println("4-온도 증가");
			System.out.println("5-온도 감소");
			System.out.println("0-프로그램 종료"); //이후 안건드릴것같은 번호로 무한루프 제어
		System.out.println("원하시는 번호를 선택하세요 : ");
		int command = sc.nextInt();
		if(command==0) break; //무한루프 반복문종료 break (프로그램 제어)
		air.remote(command);
		}
System.out.println("프로그램 종료");
	}
}
