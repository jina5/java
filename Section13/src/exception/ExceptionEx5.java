package exception;

import java.util.Scanner;

public class ExceptionEx5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 :");
		int age = sc.nextInt();

		try {
			if (age < 1)
				throw new UserException("나이는 1 이상 입력하세요"); //Exception 강제 발생
			if (age > 19)
				System.out.println("성인");
			else if (age > 0)
				System.out.println("미성년자");
		} catch (UserException e) {
			e.printStackTrace();
		}
	}

}
