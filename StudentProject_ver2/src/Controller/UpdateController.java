package Controller;

import java.util.Scanner;

import VO.StudentVO;
import service.StudentService;

public class UpdateController extends Controller {
	@Override
	public void execute(Scanner sc) {
		System.out.println("학생정보 수정을 시작합니다...");
		System.out.print("수정할 학생번호 입력 : ");
		String id = sc.nextLine();
		StudentVO vo = StudentService.getInstance().searchStudent(id);

		if (vo == null) {
			System.out.println("입력한 학번에 해당하는 학생이 없습니다.");
			return;}
		
			System.out.print("수정할 이름 : ");
			vo.setName(sc.nextLine()); //이렇게 해도 되고
			System.out.print("수정할 전공 : ");
			String major = sc.nextLine();
			System.out.print("수정할 학점 : ");
			double point = sc.nextDouble();
			sc.nextLine();
			vo.setMajor(major); //이렇게 해도 됨
			vo.setPoint(point);

		
	}
}
