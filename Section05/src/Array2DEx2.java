
public class Array2DEx2 {

	public static void main(String[] args) {
		int[][] arr = { 
		//열 0 1 2 3
			{1,2,3,4}, //0행
			{5,6,7,8}, //1행 
			{9,10,11,12} //2행
		};

		for(int i=0;i<arr.length;i++) {  //행
			for(int j=0;j<arr[i].length;j++) {  //열
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
				}
	}

}
