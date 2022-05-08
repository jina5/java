import java.util.Arrays;

public class ArrayQuest04 {

	public static void main(String[] args) {

		String str = "Hello World";
		char[] arr = str.toCharArray();
		System.out.println(Arrays.toString(arr));
		/*
		 * 배열 arr 에 있는 모든 알파벳을 대문자로 변경 후 출력 A 65 , a 97 , 띄어쓰기 32
		 */

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 'a' && arr[i] <= 'z') { // 97대신 'a'로 써도 됨!!
				//arr[i] = (char) (arr[i] - 32); <- 굳이 형번환..
				arr[i] -=32; //형변환 안해도됨 
			}
		}

		System.out.println(Arrays.toString(arr));

//대문자 -> 소문자 (주의 : 띄어쓰기=32)
		for (int i = 0; i < arr.length; i++) {
			if ('A' <= arr[i] && arr[i] < 'a') { // 65, 97 대신 알파벳으로 써도됨!!
//				arr[i] = (char) (arr[i] + 32); <-굳이..
				arr[i]+=32; //형변환 안해도됨
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
