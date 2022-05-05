//상수
public class FinalTest {

	public static void main(String[] args) {
		//일반적인 변수는 값을 계속 변경 가능
		int num=100;
		num += 100; //200
		num--; //199
		System.out.println(num);
	
		//상수 
		final int i = 100; //final 키워드로 선언되면 변수가 상수가 되어 최초 저장한 값을 변경 불가능
		System.out.println(i*100); //가져다 쓰는건 가능
		
		final double pi;
		pi=3.1415; //final 변수 설정 후에 초기화 가능, 한번은 초기화 할 수 있음 - 고정
		
	
	}

}
