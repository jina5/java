
public class ArrayEx2 {

	public static void main(String[] args) {
		//배열 생성 + 초기화 (c언어방식)
		int[] arr1 = {1,2,3,4,5}; //정수형 배열 5개짜리로 선언, 순서대로 초기화 [0]=1,..[4]=5
		//배열 생성 + 초기화 (자바)
		int[] arr2 = new int[] {1,2,3,4,5,6}; //new int 옆에 갯수 지정할수없음
		//배열 생성할 때 제외하고 데이터를 한번에 넣는 방법은 없음
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);

		System.out.println("배열의 길이 : "+arr1.length); //배열 갯수(길이) 확인
		
		for(int i=0;i<arr1.length;i++) { //시작, 끝 값이 정해져있으니 반복문은 for을 사용해야 함
			System.out.println(arr1[i]);
		}
		
	}

}
