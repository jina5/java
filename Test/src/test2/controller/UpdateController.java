package test2.controller;

import java.util.Scanner;

import test2.service.ProductService;
import test2.vo.ProductVO;

public class UpdateController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("제품정보 수정을 시작합니다...");
		System.out.print("제품정보 입력 : ");
		String num = sc.nextLine();
		ProductVO vo = ProductService.getInstance().SearchProduct(num);

		if (vo == null) {
			System.out.println("입력한 제품번호의 제품이 없습니다.");
			return;}
		
			System.out.print("수정할 제품번호 : ");
			vo.setNum(sc.nextLine()); 
			System.out.print("수정할 제품명 : ");
			vo.setName(sc.nextLine());
			System.out.print("수정할 제조사 : ");
			vo.setCop(sc.nextLine());
			System.out.print("수정할 재고 : ");
			vo.setStock(sc.nextInt());
			sc.nextLine();
			System.out.print("수정할 창고위치 : ");
			vo.setHouse(sc.nextLine());



	}

}
