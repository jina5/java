import java.util.Arrays;

public class ArrayEx5 {

	public static void main(String[] args) {
		int[] arr1 = new int[4];
		char[] arr2 = new char[4];
		double[] arr3 = new double[4];
		boolean[] arr4 = new boolean[4];
		String[] arr5 = new String[5];
		
		//기본 초기화 값은 0이다

		System.out.println(Arrays.toString(arr1)); // 0
		System.out.println(Arrays.toString(arr2)); //       : null(0) - 화면에 표시x
		System.out.println(Arrays.toString(arr3)); // 0.0
		System.out.println(Arrays.toString(arr4)); // false : false=0
		System.out.println(Arrays.toString(arr5)); // null  : null - 메모리 주소가 없다
		// 문자열이 끝날때 null로 저장되어있음(출력 중지), 화면에 표시X (0 : null)
		// string은 메모리 주소를 저장하는 reference형이므로 null이 나온다
		// null : 데이터없음
  
	}

}
