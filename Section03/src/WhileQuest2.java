
public class WhileQuest2 {
/*
 * 1~100까지 숫자들 중
 * 5와 7의 배수를 출력하시오
 * 단 5와 7의 공배수는 한번만 출력되게끔 하시오
 */

	
	public static void main(String[] args) {
		int i=1;
		while (i<=100) {
//내가한것		if (i%35==0) {System.out.println(i);  //이거 안해도 35 중복으로 안나옴! 괜히 한것임
//			}
//			else if (i%5==0) {System.out.println(i);
//			}
//			else if (i%7==0) {System.out.println(i);
//			}
//			i++;
			
//다른방식		if (i%5==0) System.out.println(i);
//			else if (i%7==0) System.out.println(i);
//			i++;
			
			if(i%5==0||i%7==0)  //다른방식
				System.out.println(i);
			i++;
		
		}
	}

}
