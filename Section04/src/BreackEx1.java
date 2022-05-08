//break : 반복문 종료
public class BreackEx1 {
/*
 * 반복문을 종료하는 break는 if문과 함께 나온다
 * if 조건을 만족하면 반복문 종료
 * break는 break를 직접 감싸고 있는 반복문 하나만 종료
 * 한번에 하나만 종료 가능
 * switch의 break는 반복문 제어와 관계없음
 */
	public static void main(String[] args) {
		int i = 1, sum = 0;
		while (true) { // 조건식에 true : 무한루프 (for(;;)하면 무한루프 가능)
			sum+=i;
			i++;
			if(sum>5000) {
				break; 
			}
		}
System.out.println(sum);
	}

}
