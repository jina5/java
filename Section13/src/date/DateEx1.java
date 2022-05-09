package date;


import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime()); //현재 날짜 시간... 을 정수로 표현 (밀리초 단위로)
		Date start = new Date(1); //밀리초...
		System.out.println(start);
		Date date = new Date(120,1,1); //년: 작성년도에서 1900을 더함, 월정보가 0부터 시작하기때문에 1으로쓰면 2월 
		System.out.println(date);
		System.out.println(date.getTime());
		Date date1 = new Date(120,11,31); //11 -> 12월
		System.out.println(date1);
		
		


		
	}

}
