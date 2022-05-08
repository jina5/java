package inheritance_02;

public class EmployeeMain {
	
	//Employee는 SalaryEmployee, DispatchEmployee까지 올 수 있다. (자식 클래스라서)
	public static void work(Employee e) { //Employee 상속받은 자식 들어올수있다 
		e.work(); //하나의 메서드 
	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		SalaryEmployee e2 = new SalaryEmployee();
		DispatchEmployee e3 = new DispatchEmployee();
		work(e1); 
		work(e2);
		work(e3);
		//하나의 메서드로 3개의 일을 한다 (다형성) - 오버라이딩 해두었기 때문에 

	}

}
