package lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Lotto_ver1 {

	public static void main(String[] args) {
		Random r = new Random();
		HashSet<Integer> set = new HashSet<Integer>();

		while (set.size() < 6) {
			set.add(r.nextInt(45) + 1);
		}

		System.out.println(set);

//list 이용 : if, contains로 확인

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 6;) {
			int n = r.nextInt(45) + 1;
			if (list.contains(n))
			continue;
			else
				list.add(n);
			i++;

		}
		System.out.println(list);
		
//배열 이용

		int add[] = new int[6];
		for (int i = 0; i < 6; i++) {
			int n = r.nextInt(45) + 1;
			boolean flag = true;
			for (int j = 0; j < i; j++) {
				if (n == add[j]) { //뽑은 n이 과거 배열의 숫자와 중복인지 확인
					flag = false; 
					i--;
					break; //중복이면 i 그대로, 값 저장x
				}
			}
			if (flag) //중복이 아니면 배열에 추가
				add[i] = n;
		}
		System.out.println(Arrays.toString(add));
		
		
		//사용자로부터 구매할 로또 개수를 입력받아서 그 개수만큼 로또번호를 세트로 발급
			Scanner sc = new Scanner(System.in);
			System.out.println("구매할 로또 개수 : ");
			int n = sc.nextInt();
			HashSet<Integer> set1 = new HashSet<Integer>();
			for (int i = 0; i < n; i++) {
				set1.clear();
				for (; set1.size() < 6;)
					set1.add(r.nextInt(45) + 1);
				System.out.println(set1);
	}

}}
