package exception;

public class ExceptionEx2 {

	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println(5 / 1); // 5/0하면 exception
			System.out.println(2);
			int[] arr = { 1, 2, 3 };
			arr[3]++; // arr[(3이상)]++; 이면 outofbounds exception 발생
			System.out.println(3);
		} // catch(Exception e){ } //가장 높은 Exception이 나오면 밑에 명령이 쓸모가없어짐..
		catch (ArithmeticException e) {
			System.out.println(4);
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(5);
			System.out.println(e.getMessage());
			e.printStackTrace(); // 빨간색 에러메세지
		} // 먼저 발생한 exception 기준
		System.out.println(6);
	}

}
