package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {
	/*
	 * Map 키(Key)값을 이용해서 데이터(Value)를 저장, 삭제, 읽기, 수정
	 */
	public static void main(String[] args) {
		HashMap<String, Person> map = new HashMap<String, Person>();
		// 데이터 추가
		map.put("홍길동", new Person("홍길동", 26));
		map.put("오길동", new Person("오길동", 31));
		map.put("김길동", new Person("김길동", 46));
		map.put("길길동", new Person("길길동", 13));
		map.put("홍길동", new Person("홍길동", 60)); // 홍길동은 60으로 나온다, 중복된 데이터는 기존값을 지우고 나중값으로 수정한다.
		System.out.println(map);
		System.out.println(map.get("길길동"));
		System.out.println(map.get("홍길동"));

		// 키값은 중복되면 안되니까 set으로 관리함
		// 키값을 전체조회해서 뽑아서 사용하기
		//set 인터페이스 hashset 
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key + " " +map.get(key));
		}
		//맵에 저장된 데이터 개수
		System.out.println(map.size());
		
		//맵에 해당하는 키값이 있나?
		System.out.println(map.containsKey("홍길동"));
		
		//맵에 해당하는 값이 있나?
		System.out.println(map.containsValue(new Person("홍길동",60)));
		
		//맵에 데이터가 비어있는지?
		System.out.println(map.isEmpty());
		
		//맵 내용 비우기
		//map.clear();
		
		//특정 데이터 삭제
		map.remove("홍길동");
		System.out.println(map.containsKey("홍길동")); //홍길동 key 삭제되었음
		System.out.println(map.get("홍길동"));//null : 데이터 없음
	}

}
