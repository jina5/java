// 2차원 배열
public class Array2DEx1 {

	public static void main(String[] args) {
		int[][] arr = new int[3][4]; // 정수형 배열 3행 4열짜리로 생성
		System.out.println("행 개수 : "+arr.length); //행 개수
		System.out.println("0번 행의 열 개수 : "+arr[0].length); //열 개수
		System.out.println("1번 행의 열 개수 : "+arr[1].length);
		System.out.println("2번 행의 열 개수 : "+arr[2].length);
		
		
		for (int i = 0; i < 3; i++) { // 행번호 제어
			for(int j=0;j<4;j++) { //열번호 제어
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
