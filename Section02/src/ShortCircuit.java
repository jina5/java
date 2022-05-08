//단락회로 
public class ShortCircuit {

	// 단락회로 : and나 or 연산시 앞에 있는 조건의 결과가 
	// 이미 true나 false로 결정이 된 경우에는 뒤에 있는 연산을 생략한다.
	
	public static void main(String[] args) {
		int n1=10, n2=20;
		boolean result = n1>10 && ++n2>10; //앞의 식 false
		System.out.println(result);
		System.out.println(n2); //20
		
		result = n1>5||++n2>20; //앞의 식 true
		System.out.println(result);
		System.out.println(n2); //20
		
		result = n1<5||++n2>20; //F,T -> true
		System.out.println(result);
		System.out.println(n2); //21
	
		
		//식이 왼쪽 조건에서 T,F 결정 될 때 뒤에것 연산하지 않음 (++ 반영 안됨)
		//true,false 연산 오래걸리기 때문에 최대한 줄이기 위함
		

	}

}
