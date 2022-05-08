package inter_ex;

public interface InterA {
	public static final double PI = 3.1415;
	//public static final은 자동으로 붙음 (S,F)
	//outline - 동그라미 색 채워있음 : 메서드 , 중간에 비어있음 : 변수
	
	//default method (jdk8부터 지원)
	default double circleArea(int r) {
		return r*r*PI;
	}
	public void interA();

	
}
