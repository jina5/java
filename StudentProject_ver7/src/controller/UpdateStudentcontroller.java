package controller;

import java.util.Scanner;

import exception.StudentException;
import service.StudentService;
import vo.StudentVO;

public class UpdateStudentcontroller implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("학생정보 수정을 시작합니다...");
		System.out.println("학번 입력 : ");
		String sno = sc.nextLine();
		try {
			StudentVO vo = StudentService.getInstance().selectStudent(sno);
			System.out.println("이름 : ");
			vo.setSname(sc.nextLine());
			System.out.println("학과번호 : ");
			vo.setMajorNo(sc.nextInt());
			System.out.println("학점 : ");
			vo.setScore(sc.nextDouble());
			StudentService.getInstance().updateStudent(vo);
			
			
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}
	}

}
