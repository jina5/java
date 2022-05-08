package method;

public class MethodParameter {

	public static void addArray(int[] arr) { //arr은 int형 배열만 저장한다
		for(int i=0;i<arr.length;i++) { //arr[i]값 1씩 저장하는 메서드
			arr[i] += 1;
			
		}
	}
	public static int sum(int...arr2) { //가변인자(들어오는 배열 갯수, 값 정해져있지 않을때 사용 "변수...배열이름")
		// 계산했을때 결과값 주는 용도로는 괜찮은데 데이터 받아서 수정할수 없음
		int sum = 0 ;
		for(int i=0;i<arr2.length;i++)
			sum+=arr2[i];
		return sum;
	}
	
	
	public static void main(String[] args) {
	int[] arr=new int[] {1,2,3,4,5}; 
	addArray(arr); //배열만들어줘야 적용가능 
	for(int i=0; i<arr.length;i++)
		System.out.println(arr[i]); //2,3,4,5,6
	
	
	System.out.println(sum(1,2,3,4,5)); //가변인자 이용한 메서드, 
	System.out.println(sum(1,2,3));
	System.out.println(sum(1,2,3,4,5,6,7,8,9,10));

	}

}
