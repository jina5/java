// switch 선택문

public class SwitchEx {

	/*
	 * switch는 값과 case 옆의 비교값과 일치하는 순간부터 switch 내부의 코드들을 전부 실행 (break를 만날 때까지)
	 * break는 switch를 종료 시킨다.
	 * switch에서 비교 가능한 값은 정수, 문자(char), 문자열만 가능 (실수X)
	 * 값만 들어가고, 연산자나 조건식은 안됨!!!
	 * 
	 * if->switch 가능, switch->if 안될때 많음..
	 * switch는 언제? 비교값이 규모가 작고 정확히 정해져있을 때
	 * 
	 * switch(값){
	 * case 비교값:
	 * 코드
	 * [break;] -선택사항 (끊고싶을 때)
	 * dafult:
	 * 코드
	 * }
	 * 
	 * 무조건 case 이후에 명령, case없이 바로 명령하면 안됨
	 * switch는 한줄일수가 없어서 {} 꼭 써야 함
	 */
	
	public static void main(String[] args) {
	int no =2;
	
	switch(no) {
	case 1: //if(no==1) 
		System.out.println("One"); 
		break;
	case 2:
		System.out.println("Two");
		break;
	case 3:
		System.out.println("Three");
		break;
	default: //모든 케이스 아닐때 
		System.out.println("???");
		//two
	
	}
	
	//break 없을 때, 해당되는 case부터 전부 실행함
	switch(no) {
	case 1: 
		System.out.println("One");
	case 2:
		System.out.println("Two");
	case 3:
		System.out.println("Three");
	default:
		System.out.println("???");
		//two three ??? 전부 나옴
	}
	

	
	}

}
