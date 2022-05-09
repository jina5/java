package Controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import VO.StudentVO;
import exception.StudentException;
import service.StudentService;

public class UpdateController implements Controller {
	@Override
	public void execute(Scanner sc) {
		System.out.println("학생정보 수정을 시작합니다...");
		System.out.print("수정할 학생번호 입력 : ");
		String id = sc.nextLine();
		StudentVO vo;
		try {
			vo = StudentService.getInstance().searchStudent(id);
			System.out.print("수정할 이름 : ");
			vo.setName(sc.nextLine());
			System.out.print("수정할 전공 : ");
			String major = sc.nextLine();
			System.out.print("수정할 학점 : ");
			double point = sc.nextDouble();
			sc.nextLine();
			vo.setMajor(major);
			vo.setPoint(point);
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("평점을 정확하게 입력하세요");
		}

	}
}
