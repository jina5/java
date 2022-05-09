package Controller;

import java.util.Scanner;

import VO.StudentVO;
import service.StudentService;

public class SearchController extends Controller {
@Override
public void execute(Scanner sc) {
	System.out.println("학생번호를 이용해서 학생정보 조회를 시작합니다......");
	System.out.print("학번 : ");
	String id = sc.nextLine(); 
	StudentVO vo = StudentService.getInstance().searchStudent(id);
	
	if(vo==null)
		System.out.println("입력하는 학번에 해당하는 학생이 없습니다.");
	else
		StudentService.getInstance().searchStudent(id);
}
}
