package step01;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz01_2 {

	// 세개의 자연수 a,b,c가 주어질때 a*b*c 계산 결과에 0부터 9까지 각각 숫자가 몇개씩 쓰였는지?
	// a,b,c는 100보다 크고 1000보다 작은 자연수
	// 첫째줄에는 0이 몇번쓰였는지, 두번째줄 1이 .... 출력

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;

		while (true) {
			System.out.print("숫자 1 : ");
			a = sc.nextInt();
			if (a < 100 || a > 1000) {
				System.out.println("숫자는 100보다 크고 1000보다 작은 자연수만 입력가능합니다");
				continue;
			}

			System.out.print("숫자 2 : ");
			b = sc.nextInt();
			if (b < 100 || b > 1000) {
				System.out.println("숫자는 100보다 크고 1000보다 작은 자연수만 입력가능합니다");
				continue;
			}

			System.out.print("숫자 3 : ");
			c = sc.nextInt();
			if (c < 100 || c > 1000) {
				System.out.println("숫자는 100보다 크고 1000보다 작은 자연수만 입력가능합니다");
				continue;
			}
			break;
		}

		int result = a * b * c;
		System.out.println("3개의 숫자의 곱 : " + result);
		int arr[] = new int[10];

		
		String str =String.valueOf(result); //숫자를 문자열로 바꿔줌
		char[] numbers = str.toCharArray(); //문자열 내용을 char 배열로 바꿔줌
				for(int i=0;i<numbers.length;i++) {
					//System.out.println(numbers[i]); //결과값은 숫자가 아닌 문자코드임 (int) 하면 숫자로 바뀜 문자코드 (0 -> 숫자 48이다. -48하면 실제 숫자값이 나온다)
				System.out.println(numbers[i]-48);
				arr[numbers[i]-48]++;}
			
				System.out.println(Arrays.toString(arr));
}

	}

