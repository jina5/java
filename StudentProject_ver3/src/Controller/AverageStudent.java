package Controller;

import java.util.Scanner;

import service.StudentService;

public class AverageStudent implements Controller {

	@Override
	public void execute(Scanner sc) {
	
		double d = StudentService.getInstance().AverageStudent();
		System.out.println(d);

	}

}
