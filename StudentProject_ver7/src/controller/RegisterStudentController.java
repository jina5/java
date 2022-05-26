package controller;


import java.util.Scanner;
import exception.StudentException;
import service.StudentService;
import vo.StudentVO;

public class RegisterStudentController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("학생 정보 등록을 시작합니다...");
		StudentVO vo = null; //데이터 한번에 보낼지 따로보낼지 결정
		System.out.print("학번 : ");
		String sno = sc.nextLine();		
		try {		
			vo = StudentService.getInstance().selectStudent(sno);
		
		while(vo != null) {
			System.out.println("학번중복되었습니다.");
			System.out.println("학번입력:");
			sno = sc.nextLine();
			vo=StudentService.getInstance().selectStudent(sno);
		
		}
		} catch (StudentException e) {
			System.out.println("학번이중복되지않았습니다.");
		} 
		
		System.out.print("이름 : ");
		String sname = sc.nextLine();
		System.out.print("학과번호 :");
		int majorNo = sc.nextInt();
		System.out.print("학점 : ");
		double score = sc.nextDouble();
		sc.nextLine();
	
		int result=StudentService.getInstance().insertStudent(new StudentVO(sno,sname,majorNo,null,score));
		System.out.println(result);
	}

}
