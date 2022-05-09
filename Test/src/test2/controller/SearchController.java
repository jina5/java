package test2.controller;

import java.util.Scanner;

import test2.service.ProductService;
import test2.vo.ProductVO;


public class SearchController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("제품번호를 이용해서 제품 조회를 시작합니다......");
		System.out.print("제품번호 : ");
		String num = sc.nextLine(); 
		ProductVO vo = ProductService.getInstance().SearchProduct(num);
		
		if(vo==null)
			System.out.println("해당하는 제품이 없습니다.");
		else
			vo.printProductInfo();
	}

}
