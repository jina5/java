package Controller;

import java.util.Scanner;

import VO.StudentVO;
import service.StudentService;

public class RegisterController extends Controller {

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

		StudentService.getInstance().registerStudent(new StudentVO(id, name, major, point));
	}

}
