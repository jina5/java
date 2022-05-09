import java.util.Scanner;

public class ArrayQuest02 {
	/*
	 * 정수형 배열 길이가 10개인 배열을 생성한 후 
	 * 정수를 입력받아 배열에 각 요소에 전부 입력한 후 배열에 있는 값들 중 
	 * 제일 큰값, 제일 작은 값을 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "번째 정수 : ");
			arr[i] = sc.nextInt();
		}
		int max, min;
		max=min=arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
			if (arr[i] < min)
				min = arr[i]; //max, min 한번에 정리할수있음
	
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	}

}
