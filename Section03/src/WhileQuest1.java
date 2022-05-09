import java.util.Scanner;

public class WhileQuest1 {
/*
 * 정수 하나를 입력받아서 입력받은 정수 갯수 만큼
 * helloworld 출력 
 */
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int n = sc.nextInt();
		
//		int i=0;
//		while (i<n) {  
//			System.out.println("Hello World");
//			i++;}	-> (i++<n) 이라고 해도 됨

		while (n>0) { // n!=0 으로 해도 됨 
			System.out.println("Hello World");
			n--;
		}
		
		
	}}
