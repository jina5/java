package employee;

//영업직 클래스는 영업포인트(int)를 필드로 가지고있음
//영업직은 기본급(salary)이 100으로 고정되어 잇으며
//급여 계산시 영업 포인트 기준 20% 만큼 추가해서 급여로 책정
//급여 책정하는 메서드를 재정의 하시오
public class SalaryEmployee extends Employee {
private int point;

public SalaryEmployee(String eno, String name, int point) { //salary 입력 안받음
	super(eno, name, 100); //salary 고정값 넣음
	this.point = point;
}

@Override
public int getSalary() {
	return (int)(point*0.2+salary); //salary -> protected 
}



}
