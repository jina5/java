package exception;

public class ExceptionEx1 {
	public static void main(String[] args) {
		try { 
			System.out.println(1);
			System.out.println(5 / 0); // 문법적으로는 정상, 실행중에 난 에러 = exception이 발생
			System.out.println(2);
		} catch (Exception e) { //모든 exception은 Exception을 상속받음
			System.out.println(3); //exception이 발생할때만 실행
		}
		System.out.println(4);
	}

}
