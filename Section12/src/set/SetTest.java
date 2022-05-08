package set;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
	/*
	 * Set (list 반대라고생각..) 1. 데이터 중복 x, 고유값만 들어감 2. 데이터 자동정렬 일반적인 데이터 보관용도로 사용하기엔
	 * 부적절, 주로 고유값 저장할때 사용
	 */
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		// 데이터 등록
		set.add("HTML/CSS");
		set.add("js/jQuery");
		set.add("JAVA");
		set.add("Spring");
		set.add("JAVA");
		set.add("Android");
		set.add("js/jQuery");
		System.out.println(set); // 중복값 안들어감, 데이터 순서 바뀜

		// 데이터 삭제
		set.remove("JAVA");
		System.out.println(set);

		// 데이터 개수
		System.out.println(set.size());

		// 데이터 검색
		System.out.println(set.contains("Spring"));

		// 데이터 존재 유무
		System.out.println(set.isEmpty());

		// set에 내용 비우기
		// set.clear();

		// 전체 조회 -1. iterator (외우기)
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();

		// 전체 조회 -2. set의 내용을 배열로 받아서 조회 (형변환 귀찮아서 별로..)
		Object[] arr = set.toArray();
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

	}

}
