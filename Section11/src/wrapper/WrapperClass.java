package wrapper;

public class WrapperClass { //primitive type을 객체로 다루기위해...

	public static void main(String[] args) {
		Integer n1 = 100; 	// 타입은 클래스인데 int 처럼 변수에 저장됨
		Integer n2 = new Integer("200"); 	// 숫자로 저장됨, 생성자로도 가능하긴하다
		System.out.println((n1 + n2)); 	// 위에거 숫자였는 지 확인, 300
		// Wrapper 클래스 사용법
		System.out.println(Integer.MAX_VALUE); 	// int형은 4바이트=32비트
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.BYTES);	// 몇바이트? 4
		System.out.println(Integer.SIZE);
		System.out.println(Integer.parseInt("123") * 2); 	// 문자를 숫자로 변경
		System.out.println(Double.parseDouble("3.1415") * 7); 	// 문자를 실수로 변경

		int i1 = 100;
		// auto boxing
		Integer i2 = i1; 	// primitive 타입을 객체로 만든다 (wrapping, box에 넣는다)
		// auto unboxing
		int i3 = i2; 	// 다시 primitive 타입으로...(int)

		// 1.5 이전 버전에서의 boxing, unboxing (예전에는 object 사용해서 했다)
		int i4 = 100;
		Object obj = i4;
		Integer i5 = (Integer) obj;
		Object val = i5;
		int i6 = (int) val;
	}
}
