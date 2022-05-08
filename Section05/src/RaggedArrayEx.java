
public class RaggedArrayEx {
	public static void main(String[] args) {
		int[][] arr = new int[3][]; //열 정보없음, 1차원배열 3개 (arr[0],[1],[2])
		arr[0] = new int[4]; //arr[0][0], arr[0][1], [0][2], [0][3]
		arr[1] = new int[3];
		arr[2] = new int[] { 1, 5, 6, 7, 8, 3, 47,56 };
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println();
		arr[0] = new int[5]; //0번째 행에 5개짜리 열으로 교체
		System.out.println(arr[0]);
	}

}
