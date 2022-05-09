//do while
public class DoWhile {
/*
 * while, for -> 선검사 후처리
 * do - while -> 유일하게 선처리 후검사 방식, 처음 조건이 거짓이더라도 한번은 반드시 실행
 * do{명령} while(조건); 
 * 
 */
	public static void main(String[] args) {
		int i = 0;
		do {
			System.out.println("Hello World");
			i++;
		} while (i<5); //while 뒤에 ; 마감처리해줘야 while문과 구분 됨
	}

}
