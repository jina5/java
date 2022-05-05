// reference type 참조형타입 변수 - String
// 저장된 데이터가 있는 메모리 주소(위치)를 저장
public class StringType {

	public static void main(String[] args) {
		String str="Hello World"; 
		// String 색이 int 같은 것들과 다름.. 
		// primitive type(고정형) 변수는 이미 키워드로 저장해둠 
		// primitive type 아니면 (reference type, String) 미리 지정된 키워드가 아님 
		System.out.println(str);
		
		String str1 = "Exit"; //str1:"Exit"문자열 있는 메모리주소 저장
		String str2 = new String("Exit"); //메모리를 새로 만들겠다. str1, str2 저장된 메모리 주소 다름
		String str3 = str1; //str1 저장된 메모리 주소와 같음 
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		//문자열이 저장되어 있는 메모리 주소 비교
		//reference type 비교는 메모리 주소 비교임
		//메모리 주소는 정수로 되어있음, 0과 양수만! (음수x)
		System.out.println(str1==str2); //false
		System.out.println(str1==str3); //true
		System.out.println(str2==str3); //false
		
		//문자열 내부 내용 비교? equals 사용
		//문자열 동일한가?
		System.out.println(str1.equals(str2)); //문자열 동일, true
		//문자열 다른가? not (!) 사용
		System.out.println(!str1.equals(str2)); //문자열 동일, false
	
	
	}

}
