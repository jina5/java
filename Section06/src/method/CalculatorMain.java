package method;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
//		cal.inputNumber(); //메서드 호출, 매개변수x 실행할때 데이터 필요없다
//		System.out.println(cal.sum());
		
		cal.init(10,20);
		System.out.println(cal.sum());
		System.out.println(cal.minus(7, 8));
		
	}

}
