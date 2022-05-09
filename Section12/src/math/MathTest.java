package math;

public class MathTest {

	public static void main(String[] args) {
		//절대값
		System.out.println(Math.abs(-300));
		
		//올림
		System.out.println(Math.ceil(3.4));
		System.out.println(Math.ceil(-3.4));
		
		//내림
		System.out.println(Math.floor(3.4));
		System.out.println(Math.floor(-3.4));
		
		//반올림
		System.out.println(Math.round(3.4));
		System.out.println(Math.round(-3.4));
		
		//둘중에 큰 숫자
		System.out.println(Math.max(21, 30));

		//둘중에 작은 숫자
		System.out.println(Math.min(21, 30));
		
		//랜덤
		System.out.println(Math.random()); //0.0~0.999999999
	
		//1~45 숫자를 랜덤하게 뽑기
		System.out.println(Math.floor((Math.random()*45))+1);
	
	
	
	}

	private static char[] abs(double d) {
		// TODO Auto-generated method stub
		return null;
	}

}
