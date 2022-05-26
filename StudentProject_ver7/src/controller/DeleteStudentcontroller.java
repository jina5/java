package controller;

import java.util.Scanner;

import service.StudentService;

public class DeleteStudentcontroller implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("학생 정보 삭제를 시작합니다....");
		System.out.print("학번 : ");
		String sno = sc.nextLine();			
		StudentService.getInstance().deleteStudent(sno);
	
	}
	}


