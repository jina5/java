//변수선언
public class VariableType {
/* 
 * 변수타입 (저장하는 값의 범위가 있다)
 * 	정수형 : byte(1byte) short(2) int(4) long(8)
 * 1byte - 8bit
 * byte(1) - 2^8 : 숫자범위 -2^7~0~2^7-1
 * short(2) - 2^16 : 숫자범위 -2^15~0~2^15-1
 * int(4) - 2^32 : 숫자범위 -2^31~0~2^31-1
 * long(8) - 2^64 : 숫자범위 -2^63~0~2^63-1
 * 	실수형 : float(4) double(8)
 * 	문자형 : char(2)
 * 	논리형 : boolean(1)
 * 
 * Primitive(고정형) type : 할당되는 메모리 크기가 정해져있기 때문에 최대/최소값이 정해짐
 * int, float, double, char, boolean, byte, short
 * Reference(참조형) type : 저장된 데이터가 있는 메모리 주소(위치)를 저장, 저장할 수 있는 크기가 가변적
 * String(문자열) 
 * 
 */
	public static void main(String[] args) {
long n = 100l; // L:100은 long 타입 데이터
System.out.println(n);

double d = 3.1415;
System.out.println(d);

float f = 3.1415f; // float 타입이라 뒤에 f
System.out.println(f);

//문자형 : A = 65 / a=97 / " "=32
char ch = 'a';
int n1 = ch;
// 문자형 -> 정수형
// 형변환 : data casting  
System.out.println(ch);
System.out.println(n1);

// true = 1 , false = 0 (0이 아닌 숫자는 true)
boolean c = true;
System.out.println(c);
c = false;
System.out.println(c);
	}
}

