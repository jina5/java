import java.util.Arrays;

//for each
public class ArrayEx4 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		// for each
		// 배열에 있는 값을 처음부터 끝까지 하나씩 가져온다
		for (int n : arr) { // 배열에 있는 값을 하나씩 n에 copy해서 저장 -> index++ (데이터 있을 때까지)
			System.out.println(n);
			n++; //이건 아무의미없음. n과 arr는 별개임. 
			//n은 arr로부터 값을 하나씩 복사 받기 때문에 n값이 바뀌어도 arr과는 관계없음
		}
		System.out.println(Arrays.toString(arr));
	}

}
