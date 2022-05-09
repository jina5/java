package employee;

import java.util.Scanner;

public class EmployeeServiceMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService service = new EmployeeService();
		service.registerEmployee(sc);
		service.printAllEmployee();

		

	}

}
