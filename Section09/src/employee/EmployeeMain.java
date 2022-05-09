package employee;

public class EmployeeMain {

	public static void main(String[] args) {
		SalaryEmployee emp = new SalaryEmployee("abc0123", "홍길동", 100);
		emp.printEmployeeInfo();

		DispatchEmployee emp2 = new DispatchEmployee("bbb0322", "김길동", 100, 'A');
		emp2.printEmployeeInfo();
	}
}
