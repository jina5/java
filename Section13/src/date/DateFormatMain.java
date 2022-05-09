package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateFormatMain {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

//날짜 서식문자를 이용해서 원하는 형태로 날짜를 문자열로 만들어주는 클래스
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy");
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("yy");
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("MM"); // 월 두자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("M"); // 월 한자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("MMM"); // 로컬형식 월
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("MMMM"); // 로컬형식 월
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("d"); // 일 한자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("dd"); // 일 두자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("E"); // 요일
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("EEEE"); // 요일 풀네임(로컬 형식, 한글)
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("H"); // 시간 한자리 : 24시 기준
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("HH"); // 시간 두자리 : 24시 기준
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("K"); // 시간 한자리 : 12시 기준
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("KK"); // 시간 두자리 : 12시 기준
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("m"); // 분 한자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("mm"); // 분 두자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("s"); // 초 한자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("ss"); // 초 두자리
		System.out.println(sdf.format(cal.getTime())); 

		// 2022-04-29 12:22:50
		sdf.applyPattern("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		// 2022년 04월 29일 12시 22분 50초
		sdf.applyPattern("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println(sdf.format(cal.getTime()));

	}

}
