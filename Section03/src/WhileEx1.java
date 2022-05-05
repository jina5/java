//while 반복문
public class WhileEx1 {

	/*
	 * while(조건식){
	 * 	    반복할코드1
	 *      반복할코드2
	 *       ...
	 *      }
	 *      while문은 조건식이 true면 {실행할 영역} 코드를 반복한다.
	 *      조건식이 false이면 반복을 멈춘다. (선검사 후처리)
	 *   
	 */
	
	public static void main(String[] args) {
		int i=0; 	//초기값 i : 반복문을 제어하는 제어변수
		while (i<5) {  //조건식
			System.out.println("Hello World");
			i+=1; 	// 제어변수의 증감식 (i+=1, i++, ++i 상관없음)
		}
		
		
		
		
		
		
	}

}
