package quest;
import java.util.Scanner;

public class quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자:");
		String m = sc.nextLine();
		int sum = 0;
//		char[] arr = new char[m.length()];
		
		for (int i = m.length()-1; i > -1 ; i--) {
//			arr[m.length()-1-i] = m.charAt(i);
			System.out.print(m.charAt(i));
			sum += m.charAt(i) - '0';
		}

//		System.out.println(arr);
		System.out.println("합:" + sum);

	}

}
