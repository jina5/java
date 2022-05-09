package Controller;

import java.util.ArrayList;
import java.util.Scanner;

import VO.StudentVO;
import service.StudentService;

public class PrintAllController implements Controller {
@Override
public void execute(Scanner sc) {
	ArrayList<StudentVO> list= StudentService.getInstance().getList();
	if (list.isEmpty()) {
		System.out.println("학생 데이터가 하나도 없습니다.");
		return;
	}
	
	for(int i = 0 ; i<list.size() ; i++) {
		list.get(i).printStudentInfo();
	}
}
}
