package Controller;

import java.util.Scanner;

import VO.StudentVO;
import exception.StudentException;
import service.StudentService;

public class SearchController implements Controller {
	@Override
	public void execute(Scanner sc) {
		System.out.println("학생번호를 이용해서 학생정보 조회를 시작합니다......");
		System.out.print("학번 : ");
		String id = sc.nextLine();
		StudentVO vo;
		try {
			vo = StudentService.getInstance().searchStudent(id);
			vo.printStudentInfo();
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}
	}
}