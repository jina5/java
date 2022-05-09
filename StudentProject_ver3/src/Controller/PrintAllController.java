package Controller;

import java.util.Scanner;

import VO.StudentVO;
import service.StudentService;

public class PrintAllController implements Controller {
@Override
public void execute(Scanner sc) {
	//index 받음
	int index = StudentService.getInstance().getIndex();
	if (index==0) {
		System.out.println("학생 데이터가 하나도 없습니다.");
	
		return; //작업 종료
	}
	
	//배열받음
	StudentVO[] arr = StudentService.getInstance().getArr();
	for(int i = 0 ; i<index ; i++) {
		arr[i].printStudentInfo();
	}
}
}
