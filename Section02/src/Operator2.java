// 복합대입연산자 : 연산 결과를 왼쪽에 있는 변수에 연산 후 저장 -> 결과를 누적
//	+= -= *= /= %=
// 단항연산자
public class Operator2 {

	public static void main(String[] args) {
		int n = 10;
	//	n = n + 10; //변수 n에 숫자 10을 더해서 저장 //20
		// =:오른쪽 값을 왼쪽에 저장하겠다, 대입연산자
		n+=10; //n에,더해서 저장하겠다,10을  //20
		System.out.println(n);
		n-=3; //변수 n(20)에 3을 빼고 저장하겠다 //17
		System.out.println(n);
		n*=2; //변수 n(17)에 2를 곱하고 저장하겠다 //34
		System.out.println(n);
		n/=4; //변수 n(34)에 4를 나누고 몫을 저장하겠다 //8
		System.out.println(n);
		n%=7; //변수 n(8)에 4를 나누고 나머지를 저장하겠다 //1
		System.out.println(n);

	}

}
