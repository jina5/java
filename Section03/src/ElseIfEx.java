import java.util.Scanner;

//else if

public class ElseIfEx {
	/*
	 * else if(조건식){ 실행할코드1 실행할코드2 실행할코드3 }
	 * 
	 * if문으로 구성된 조건문에서 두번쨰 조건문부터는 else if를 이용하여 조건문을 구성 else if와 else는 반드시 if문이 있어야
	 * 사용이 가능 단 else if와 else는 조건문 구성에서 생략이 가능하다. (선택사항)
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 >>> ");
		int age = sc.nextInt();

		// 성인(20) 고등학생(17) 중학생(14) 초등학생(8) 미취학아동(그 외)
		if (age >= 20) {
			System.out.println("성인");
		} else if (age >= 17) { // && age < 20 안써도 된다
			System.out.println("고등학생");
		} else if (age >= 14) { 
			System.out.println("중학생");
		} else if (age >= 8) {
			System.out.println("초등학생");
		} else {
			System.out.println("미취학아동");
		}
		// 데이터를 순서대로 잘 짜면 조건을 줄일 수 있다
		// 반대로 미취학아동부터해도됨 : age<8, age<14, age<17 이런식으로... 
		
	}

}
