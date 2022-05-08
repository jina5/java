package date;

import java.util.Date;

public class DDay {

	public static void main(String[] args) {
		//오늘 날짜를 기준으로 2023년도 수능까지 며칠남았는지 디데이 구하기
		Date start = new Date();
		Date test = new Date(122,10,17);
		long diff = test.getTime()-start.getTime();
		System.out.println(diff/(1000*60*60*24));//밀리초 -> 초 -> 분 -> 시 -> 일
		
	}

}
