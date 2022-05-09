//조건연산자-논리연산자
public class Operator5 {

	/* 
	 * 논리연산자 : 조건식을 두개이상 사용하거나 조건식의 결과를 반대로 뒤집을 때
	 * AND : && 
	 * OR : || (shift+\)
	 * NOT : !
	 */
	public static void main(String[] args) {
		int n1=10, n2=5;
//      boolean flag = 5<n1<20;  error! 한번에 연산은 한번, 5<n1 : true -> true<20 이렇게 된다.
		
		//AND 연산 : 조건식1 && 조건식2 -> 양쪽 조건식이 모두 TRUE일 때만 TRUE가 되는 연산자
		System.out.println(n1>5&&n2<10); //t,t -> true
		System.out.println(n1>5&&n2>10); //t,f -> false
		System.out.println(n1>5&&n2<10&&n1!=n2); //t,t,t -> true
		
		//OR 연산 : 조건식1||조건식2 -> 조건식들 중에 하나라도 TRUE면 TRUE가 되는 연산자
		System.out.println(n1<5||n2>10); //f,f -> false
		System.out.println(n1<5||n2<10); //f,t -> true
		System.out.println(n1<5||n2<10||n1==n2); //f,t,f -> true
		
		// and, or 섞어쓰기 ? 왼쪽부터 먼저..
		
		//NOT 연산 :!조건식 TRUE->FALSE, FALSE->TRUE
		System.out.println(!(n1<5)); //false-> true
		boolean result = n1>5; //true
		System.out.println(!result); //false
		
		//조건식은 상대적으로 연산속도가 느리다. -> 단락회로(중간에 연산 끊음) 
		

		
	
	}

}
