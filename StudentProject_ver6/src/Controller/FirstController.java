package Controller;

import java.util.ArrayList;
import java.util.Scanner;

import VO.StudentVO;
import exception.StudentException;
import service.StudentService;

public class FirstController implements Controller {
	@Override
	public void execute(Scanner sc) {
		System.out.println("학점 석차 1등 조회...");
		ArrayList<StudentVO> list = StudentService.getInstance().firstStudent();
		try {
			if (list == null) {
				throw new StudentException("학생 데이터가 하나도 없습니다.");
			}
			for (StudentVO vo : list) { // list 내용 하나씩 뽑아올때
				vo.printStudentInfo();
			}
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}
	}
}
