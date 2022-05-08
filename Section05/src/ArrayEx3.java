import java.util.Arrays;

//문자형 배열
public class ArrayEx3 {

	public static void main(String[] args) {
		String str = "Hello World"; // 실제로는 [0]=H, [1]=e .. 이런식으로 하나씩 배열형태로 저장되어있음
		char[] arr = str.toCharArray(); // 문자열str(Hello World)를 문자형 배열로 변환해서 저장

//		for (int i = 0; i < arr.length; i++) {
//					System.out.println(arr[i]);
//				}

		// 배열에 저장된 내용을거꾸로 뒤집어서 저장 (새로운 배열 만들지 않기)
		// 0 1 2 3 4 5 6 7 8 9 10
		// H e l l o   W o r l d
		// 0번째 배열 -> 10번째 배열, 1번쨰-> 9번째...
	
//내가한것		: 우연히 인덱스가 0~10이어서 가능한 방법 ㅠㅠ 
//		for (int i = 0; i < arr.length/2; i++) {
//			char temp = 0;
//			temp=arr[i] ;
//			arr[i]=arr[10 - i];
//			arr[10-i]=temp;
//		}
		System.out.println(Arrays.toString(arr));
//index 이용하기	: 요렇게 해야함
//		int start =0, end =arr.length-1;
//		while(start<arr.length/2) {
//			char temp = arr[start]; //arr[start]<->arr[end] : 0<->10,1<->9,2<->8...
//			arr[start]=arr[end];
//			arr[end]=temp;
//			start++;
//			end--;
//		}
		//배열 내용을 한번에 확인
		System.out.println(Arrays.toString(arr)); //배열의 내용들을 하나의 문자열로 만들어서 출력

//start index만 사용하기 : end = arr.length-1-start
	int start =0;
	while(start<arr.length/2) {
		char temp = arr[start]; 
		arr[start]=arr[(arr.length-1)-start];
		arr[(arr.length-1)-start]=temp;
		start++;
	}
	System.out.println(Arrays.toString(arr));
}}
