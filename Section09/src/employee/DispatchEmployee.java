package employee;
//파견직 클래스는 위험도(A,B,C)를 필드로 가지고있음
//파견직 급여 책정 방법은 위험도에 따라 기본급 + 보너스
//보너스 계산시 위험도 A일 경우 기본급*50%, B일 경우 기본급*30%, C일 경우 기본급*20% 참고하여 급여 책정하는 메서드를 재정의 하시오

public class DispatchEmployee extends Employee {
	private char danger;

	public DispatchEmployee(String eno, String name, int salary, char danger) {
		super(eno, name, salary);
		this.danger = danger;
	}

	@Override
	public int getSalary() {
		switch (danger) {
		case 'A':
			return salary + (int) (salary * 0.5);
		case 'B':
			return salary + (int) (salary * 0.3);
		case 'C':
			return salary + (int) (salary * 0.2);
		default:
			return salary;
		}
	}
}
