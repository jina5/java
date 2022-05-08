package inheritance_02;

public class SalaryEmployee extends Employee { // employee 상속받는다
	@Override
	public void work() {
		System.out.println("직원이 영업을 합니다.");
	}

}
