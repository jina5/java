//반복문 for
public class ForEx1 {
/*
 * for(초기화;조건식;증감식){
 * 	  실행할 코드1
 *    실행할 코드2
 *    ...
 *    }
 * 
 * 데이터 시작과 끝이 정해진 경우 for
 * 특정 조건을 만족할때까지 반복하고 싶으면 while
 * for, while 호환 가능
 * 
 */
	public static void main(String[] args) {
		int i;
		for(i=0;i<5;i++) { //초기화->조건식 true->코드실행->증감식..->조건식부터 반복 (초기화는 가장 처음 1번만 실행)
			System.out.println("Hello World");
		}
	}

}
