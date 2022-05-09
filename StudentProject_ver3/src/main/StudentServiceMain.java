package main;

import java.util.Scanner;

import Controller.Controller;
import Controller.HandlerMapping; 

public class StudentServiceMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("----- 학생정보관리 프로그램 -----");
			System.out.println("1- 학생 정보 등록");
			System.out.println("2- 전체 학생 정보 조회");
			System.out.println("3- 학생 정보 조회");
			System.out.println("4- 학생 정보 수정");
			System.out.println("5- 학생 정보 삭제");
			System.out.println("6- 전체석차 1등 조회");
			System.out.println("0- 프로그램 종료");
			System.out.println("원하시는 메뉴를 선택하세요 : ");
			int num = sc.nextInt();
			sc.nextLine();
			if (num == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			Controller controller = HandlerMapping.getInstance().createController(num); //체인함수 ( . 찍어서 연결)
			if(controller!=null)
			controller.execute(sc);
			
		}
	}
}
