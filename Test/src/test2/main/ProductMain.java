package test2.main;

import java.util.Scanner;

import test2.controller.Controller;
import test2.controller.HandlerMapping;

public class ProductMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("----제품관리 프로그램----");
			System.out.println("1. 제품정보 등록");
			System.out.println("2. 제품정보 검색");
			System.out.println("3. 제품정보 수정");
			System.out.println("4. 전체 제품정보 출력");
			System.out.println("0. 프로그램 종료");
			System.out.print("원하시는 메뉴 번호를 입력하세요 : ");
			int no = sc.nextInt();
			sc.nextLine();
			if (no == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
		
		}		
		Controller controller = HandlerMapping.getInstance().createController(no);
		if(controller!=null)
			controller.execute(sc);
	}}}
	


