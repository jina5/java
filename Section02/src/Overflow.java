//overflow

public class Overflow {

	public static void main(String[] args) {
		//byte 최대값 127, 최소값 -128
		// byte b = 128; <-에러, 직접적으로 최대값 최소값 벗어나는 값은 넣을 수 없음
		byte b = 127;
		System.out.println(b);
		b++;//b에 저장된 값을 1 증가
		System.out.println(b);//-128 : 최대값 최소값 반전
		//최대값에서 넘어가면 최소값이되고 최소값에서 넘어가면 최대값이 됨.
		// 값 넘친다 = overflow
		b--;//b에 저장된 값을 1 감소
		System.out.println(b);//127
		

	}

}
