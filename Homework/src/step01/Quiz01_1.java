package step01;
import java.util.Scanner;

public class Quiz01_1 {

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

		// 자리수
		int r = 1;
		while (r <= result) {
			r *= 10; // 한자리 더 높은 자리수 나옴
		}
		r /= 10; // 정확한 자리수
		
		while (r != 0) {
			arr[result / r]++;
			result %= r;
			r /= 10;

		}
		
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	

	}
}
