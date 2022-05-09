package main;

import java.util.Scanner;

import service.StudentService;

public class StudentServiceMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentService service = new StudentService();

		while (true) { // 무한루프
			System.out.println("----- 학생정보관리 프로그램 -----");
			System.out.println("1- 학생 정보 등록");
			System.out.println("2- 전체 학생 정보 조회");
			System.out.println("3- 학생 정보 조회");
			System.out.println("4- 학생 정보 수정");
			System.out.println("5- 학생 정보 삭제");
			System.out.println("6- 전체석차 1등 조회"); //현재 등록된 학생들중 제일 큰 평점을 가진 학생 한명 출력
			System.out.println("7- 전체 학생 학점 평균");
			System.out.println("0- 프로그램 종료"); 
			System.out.println("원하시는 메뉴를 선택하세요 : ");
			int num = sc.nextInt(); 
			sc.nextLine();
			//nextInt뒤에 꼭!!!nextLine 넣어줘야함, 아니면 엔터가 안빠져서 학점이 입력된걸로 나옴
			//학생등록할때 (학번:이름: 입력하세요 이렇게 시작됨)
			switch (num) {
			case 0:
				System.out.println("프로그램 종료");
				return; //break는 switch만 종료되기때문에 프로그램 무한루프는 계속됨. return으로 해야함
				//break : 반복문 종료
				//return : 반복문을 포함하는 함수(메서드) 종료
				//continue : 반복문내에서 넘어가고, 다음 루프 진행해라
			case 1:
				service.registerStudent(sc);
				break;
			case 2:
				service.printAllStudentInfo();
				break;
			case 3:
				service.searchStudent(sc);
				break;
			case 4:
				service.updateStudent(sc);
				break;
			case 5:
				service.deleteStudent(sc);
				break;
			case 6:
				service.firstStudent();
			case 7:
				service.AverageStudent();
			}
		}
	}
}
