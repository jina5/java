//형변환
public class Casting {

	/* 
	 * 데이터 형변환 : 데이터 타입을 바꾸는 행위
	 * 자동으로 데이터 형변환(auto-casting)
	 *  - 작은 개념이 큰 개념으로 바뀌면 자동으로 변환
	 *    (정수를 실수(정수포함)로 바꿀 때)
	 *  - 메모리가 적은 타입이 메모리가 큰 타입으로 바뀔 때 자동으로 형변환
	 *    (float 타입의 데이터를 double에 저장할 때)
	 * 강제로 데이터 형변환 (-> 데이터 손실이 일어날 수 있음)
	 *  - 큰 개념이 작은 개념으로 바뀌어야 할 때 강제로 형변환
	 *  - 메모리가 큰 타입이 작은 타입으로 저장할 때
	 *    (double(8)을 float(4)나 int(4)에 넣을 때)
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int n = 120;
		double d = n; //정수 n을 실수로 형변환해서 d로 저장
		System.out.println(d);//120.0
		
		long l=n; //int형 변수 n 을 long형으로 형변환해서 저장
		System.out.println(l);
		
	//강제로 형변환 하는 방법 : (형변환할 변수타입)값OR변수
		double pi = 3.5415; 
		int i = (int)pi; //int형으로 바꾸겠다 (변환시킬 타입)
		System.out.println(i); //3 , 반올림이 아니고 소수점 데이터를 잘라낸다. 데이터 손실.
		
		int t = 65; //A = 65인데 char ch=t라고 하면 오류
		char ch = (char)t;  // char 2byte, int 4byte라서 오류 : (char) 넣어줘야 함.
		System.out.println(ch); //A
		System.out.println((int)ch); //65. 큰 범위로도 변경 가능
		
		// double result = 3+3.1415f; // 3이 3.0f 실수로 바뀜, float->double : 자동으로 형변환 2번 이루어짐
		double result = 3.0 +3.1415; // double + double = 형변환이 없음
		System.out.println(result); //6.14149996어쩌고... 소수점 부정확하게 나올 때 있어서 무시가능
		
		float f = (float) 3.14;
		System.out.println(""+7+7);
	}

}
