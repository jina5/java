package Controller;

import java.util.Scanner;

import service.StudentService;

public class DeleteController implements Controller {
	@Override
	public void execute(Scanner sc) {
		System.out.println("학생정보 삭제를 시작합니다.....");
		System.out.println("삭제할 학번을 입력학세요");
		String id = sc.nextLine();
 
		if (StudentService.getInstance().deleteStudent(id)) //boolean result 변수 설정 따로 안해줘도 된다
			System.out.println("학생 정보가 정상적으로 삭제 되었습니다.");
		else
			System.out.println("삭제할 학생 정보가 없습니다.");
	}
}
