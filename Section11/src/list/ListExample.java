package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ListExample {
	/*
	 * List의 특징 
	 * 1. 데이터를 보관할 때 중복된 데이터 저장 가능 
	 * 2. 리스트에 등록한 데이터 순서가 보장됨 (순서대로 보관)
	 * 
	 * ArrayList : 리스트에서 데이터를 배열로 관리 - 조회 쉬움
	 * LinkedList : 리스트에서 데이터를 객체들끼리 엮어서 관리 (메모리 주소에 다음데이터 연결) - 추가 삭제 쉬움
	 * Vector : ArrayList에 동기화가 적용된 형태 
	 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); // 데이터 저장할 객체 생성
		// 데이터 추가 - 순서대로 저장됨
		list.add("HTML/CSS");
		list.add("js/jQuery");
		list.add("java");
		list.add("HTML/CSS"); // 중복된 데이터도 저장됨
		list.add("jsp");

		System.out.println(list.toString());

		// 데이터 삭제 - 인덱스 번호로 삭제
		list.remove(0);
		System.out.println(list.toString());
		
		// 데이터 삭제 - 객체 비교 삭제 : equal()를 재정의 해놔야함
		list.remove("java");
		System.out.println(list.toString());// 삭제되었음, equals 생성해줘야함
		
		// 현재 리스트가 저장하고 있는 데이터 개수 : list.size()
		System.out.println(list.size());
		
		// 해당 데이터가 리스트에 있는지? : list.contains()
		System.out.println(list.contains("jsp"));
		System.out.println(list.contains("android"));

		// 리스트 모든 요소를 제거 : list.clear();

		// 리스트에 내용이 비었는지 체크 : list.isEmpty()
		System.out.println(list.isEmpty());

		// 리스트에 원하는 인덱스에 데이터 추가
		list.add(1, "android"); // 1번 인덱스에 android 넣어라, 기존 1번에 있던 내용은 뒤로 미뤄짐 (삭제되지 않음)
		System.out.println(list);// toString 안써도 자동으로 호출됨

		// 리스트에 있는 모든 객체 꺼내는 방법 1
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// 리스트에 있는 모든 객체 꺼내는 방법 2
		Iterator<String> it = list.iterator();
		while(it.hasNext()) { //읽어드릴 값 있는지? iterator가 가진 인덱스와 데이터 사이즈를 비교
			System.out.println(it.next()); //데이터를 return해주고 인덱스+1 증가 -> false일때까지 반복 (인덱스가 데이터사이즈될때)
		}
		
		
	}

}
