package string;

import java.util.ArrayList;
import java.util.Arrays;

public class StringMain {
	public static void main(String[] args) {
		String str1 = "Hello World";
		// 저장하고 있는 문자열을 바이트형 계열로 변환
		byte[] arr = str1.getBytes();
		System.out.println(Arrays.toString(arr));
		// 해당 인덱스번호에 위치한 문자 하나를 리턴
		System.out.println(str1.charAt(0)); // 0번째있는 글자 "H" , 문자열이 배열로 관리되어있음
		String str2 = "Hello World Hello Java World";
		// 문자열처음부터 검색
		System.out.println(str2.indexOf("World"));
		// 문자열 7번 인덱스부터 검색
		System.out.println(str2.indexOf("World", 7));
		// 문자열 끝에서부터 검색
		System.out.println(str2.lastIndexOf("World"));
		System.out.println(str2.lastIndexOf("World", 22));
		// 알파벳을 전부 소문자로 변환
		System.out.println(str2.toLowerCase());
		// 알파벳을 전부 대문자로 변환
		System.out.println(str2.toUpperCase());
		// 문자열 길이
		System.out.println(str2.length());
		// 문자열 부분추출 : substring
		// 10번인덱스부터 마지막까지 문자열 잘라내서 리턴 (10~)
		System.out.println(str2.substring(10));
		// 10번인덱스부터 15번 인덱스 전까지 리턴 (10~14)
		System.out.println(str2.substring(10, 15));
		// 문자열 바꾸기 : replace
		System.out.println(str2.replace("World", "Hell"));

		String str3 = "     Hello World      ";
		System.out.println(str3.length());
		// 문자열 양쪽에 공백을 제거 : trim
		System.out.println(str3.trim());
		System.out.println(str3.trim().length()); // str3은 계속 원본이 유지된다
		System.out.println(str3);
		System.out.println(str3.length());
		ArrayList<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("HTML/CSS");
		list.add("Android");
		list.add("jsp");
		list.add("js/jQuery");


		String str = ""; // 빈 문자열
		for (String s : list) {
			str += s + " ";
		}
		str = str.trim();
	
		String str5 = String.join(" ", list);
		System.out.println(str5+" "+str5.length());
		
		String[] arr2 = str5.split(" "); //잘라서 배열로..
		System.out.println(Arrays.toString(arr2));
	}
}
