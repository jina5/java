
public class ArrayEx1 {
	/*
	 * 배열(Array)
	 * 변수를 선언시 하나의 변수명으로 
	 * 동시에 여러개의 값을 저장할 공간을 만드는 자료구조
	 * (변수명 하나로 값을 여러개 저장)
	 * 
	 * 인덱스(Index) : 0 ~ 배열 갯수-1
	 * 동시에 여러개 선언된 배열의 요소들을 구분하는 번호표
	 * 
	 * 변수타입[] 배열명 = new 변수타입[갯수]; (양쪽 동일한 변수타입)
	 * 
	 */
	public static void main(String[] args) {
		int[] arr = new int[5]; //정수형 변수 5개 선언, 변수 형식에 따라 새 메모리를 생성
		//arr[0]~arr[4] 5개 공간 생김 ㅁㅁㅁㅁㅁ (선형구조) 일렬로 저장되어있음
		//배열 계산, 출력- 반복문 동반
		//변수 만들면 기본값이 0으로 지정된다 (초기화)
		
		arr[0]=10; //배열 arr의 0번째 데이터 10을 저장하겠다.
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		// arr[5]=60; 인덱스 번호가 범위에서 벗어나서 runtime error (문법적으로 문제없어서 빨간 줄 없으나 실행시 오류)

		System.out.println(arr[0]); // 0 : 인덱스
		System.out.println(arr[1]); // 1 : 인덱스
		System.out.println(arr[2]); // 2 : 인덱스
		System.out.println(arr[3]); // 3 : 인덱스
		System.out.println(arr[4]); // 4 : 인덱스
		//공간 갯수 나중에 늘릴 수 없음, 새로만들고 전부 이동시켜야 함
		
	}

}
