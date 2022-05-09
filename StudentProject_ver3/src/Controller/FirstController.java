package Controller;

import java.util.Scanner;

import VO.StudentVO;
import service.StudentService;

public class FirstController implements Controller {
	@Override
	public void execute(Scanner sc) {
		System.out.println("학점 석차 1등 조회...");
		StudentVO vo = StudentService.getInstance().firstStudent();
		if (vo == null)
			System.out.println("학생 데이터가 하나도 없습니다.");
		else
			vo.printStudentInfo();
	}
}
