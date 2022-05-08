package random;

import java.util.HashSet;
import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextDouble()); // 0.0 ~ 0.9999999999...범위에서 랜덤
		System.out.println(r.nextInt()); // int형 범위에서 랜덤
		System.out.println(r.nextInt(10)); // 0~9 랜덤
		
		//36~97 랜덤
		System.out.println(r.nextInt(62)+36); //r.nextInt(최대값+1-최소값)+최소값
		
		//로또번호 1~45, 6개의 번호를 뽑음, 똑같은 숫자는 나오면 안됨
		HashSet<Integer> set = new HashSet<Integer>();
		for(;set.size()!=6;) 
			set.add(r.nextInt(45)+1);
		System.out.println(set);
			
	}

}
