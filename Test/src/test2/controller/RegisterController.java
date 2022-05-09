package test2.controller;

import java.util.Scanner;

import test2.service.ProductService;
import test2.vo.ProductVO;

public class RegisterController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("제품정보 등록을 시작합니다...");
		System.out.println("제품 번호 : ");
		String num = sc.nextLine();
		System.out.println("제품명 : ");
		String name = sc.nextLine();
		System.out.println("제조사 : ");
		String comp = sc.nextLine();
		System.out.println("재고 : ");
		int stock = sc.nextInt();
		sc.nextLine();
		System.out.println("창고위치 : ");
		String house = sc.nextLine();

		ProductService.getInstance().RegisterStudent(new ProductVO(num, name, comp, stock, house));
	
	}

}
