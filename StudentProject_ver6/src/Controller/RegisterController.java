package Controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import VO.StudentVO;
import exception.StudentException;
import service.StudentService;

public class RegisterController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("학생 정보 등록을 시작합니다...");
		System.out.print("학번 : ");
		String id = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("전공 : ");
		String major = sc.nextLine();
		System.out.print("학점 : ");
		double point = sc.nextDouble();
		sc.nextLine();

		try {StudentService.getInstance().registerStudent(
				new StudentVO(id, name, major, point));
		System.out.println("학생정보 등록 완료");
		StudentService.getInstance().updateFile(); //파일 최신화
			
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("점수를 잘못 입력했습니다.");
		
		
	}
	}
}


