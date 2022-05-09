//증감연산자
public class Operator3 {

	/* 
	 * 증감연산자 : 변수의 값을 1씩 증가, 1씩 감소시키는 연산자
	 * 		     유일하게 =이 없어도 값을 변경시켜서 저장하는 연산자
	 *           갯수 확인할 때 많이 사용한다
	 *           
	 *  num++ 	++num 	--num 	num--
	 *  (pre)전위형 (변수 앞에 ++,--) num이 해야할 연산을 하기 전에 증가
	 *  선증가 후실행 ++num / 선감소 후실행 --num
	 *  (post)후위형 (변수 뒤에 ++,--) num이 해야할 연산을 한 뒤에 증가: num++, num--
	 *  후증가 num++ / 후감소 num-- 
	 */
	public static void main(String[] args) {
		int n1,n2;
		n1=n2=10;
		
		System.out.println(n1); //10
		System.out.println(++n1); //출력하기 전에 증가, 11
		System.out.println(n1); //11
		System.out.println("-----");
		System.out.println(n2); //10
		System.out.println(n2++); //출력하고 증가, 10
		System.out.println(n2); //11
		
		//단독으로 실행할 때는 전위든 후위든 상관이 없음
		n1++;
		++n2;  
		
		
	}

}
