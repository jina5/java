package Controller;

import java.util.Scanner;
/**
 * 모든 컨트롤러의 Interface
 * @author ITSC
 *
 */
public abstract interface Controller {
	/**
	 * 각 기능의 시작점
	 * @param sc 사용자로부터 입력받는 Scanner
	 */
	public abstract void execute(Scanner sc);  //abstract - 오버라이딩 강제화

	
}
