package test1;
import java.util.Scanner;
/*
 * 숫자 2개를 입력받은 후 최대공약수를 출력하시오
 */

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력:");
		int n = sc.nextInt();
		System.out.print("숫자 입력:");
		int m = sc.nextInt();

		int gcm = 1;
		for (int i = 2; i <= n; i++) {
			if (n % i == 0 && m % i == 0)
				gcm = i;
			System.out.println("두 수의 최대공약수 :" + gcm);
		}
	}
}
