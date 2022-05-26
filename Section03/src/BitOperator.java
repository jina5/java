// bit operator
// int 4bit
public class BitOperator {
	public static void main(String[] args) {
		
		int n1=13, n2=7; //bit : n1=1101, n2=0111
		
		//bit and operator &
		System.out.println(n1&n2); //0101 = 5
		//bit or operator |
		System.out.println(n1|n2); //1111 = 15
		//bit xor operator ^
		System.out.println(n1^n2); //1010 = 10
		//bit not operator ~
		System.out.println(~n1); 
		//left-shift operator
		System.out.println(n1<<1); //1번 왼쪽으로, 2배
		System.out.println(n1<<2); //2번 왼쪽으로, 4배
		//Right-shift operator
		System.out.println(n1>>1); //1번 오른쪽으로, 1/2배
		System.out.println(n1>>2); //2번 오른쪽으로, 1/4배
		System.out.println(n1>>3); //3번 오른쪽으로, 2^0=1
		System.out.println(n1>>4); //4번 오른쪽으로, 0
		
		System.out.println(-1>>3); //-1은 계속 -1 나옴, 
		System.out.println(-1<<3); // -1 -> -2 -> -4 -> -8
		
		
		
	}
}
