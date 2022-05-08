
public class WhileEx2 {
	
	/*
	 *  1~100까지 숫자를 더한 결과를 출력
	 */
			
	public static void main(String[] args) {
	

		int i = 1;
		int total=0;
		
		while (i<=100) {
			total += i;  //total+=i++ 으로 해도 됨
			i++;		
		}
		System.out.println(total);
	
		
		
}}
