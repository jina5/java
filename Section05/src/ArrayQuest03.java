
public class ArrayQuest03 {
/*
 * 정수형 배열 길이가 10인 배열을 선언할 때
 * 원하는 값으로 초기화를 한 후에
 * 배열에 있는 값들 중 짝수와 홀수의 개수를 출력
 */
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if (arr[i]%2==0) 
				count+=1;
		}
		System.out.println("짝수 갯수 : "+count);
		System.out.println("홀수 갯수 : "+(arr.length-count));

	}

}
