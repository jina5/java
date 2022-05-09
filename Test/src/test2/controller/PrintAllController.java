package test2.controller;

import java.util.ArrayList;
import java.util.Scanner;

import test2.service.ProductService;
import test2.vo.ProductVO;



public class PrintAllController implements Controller {

	@Override
	public void execute(Scanner sc) {
		
		ArrayList<ProductVO> list= ProductService.getInstance().getList();
		if (list.isEmpty()) {
			System.out.println("제품 데이터가 하나도 없습니다.");
			return;
		}
		
		for(ProductVO vo : list)
			vo.printProductInfo();
	
//이렇게해도됨		
//		for(int i = 0 ; i<list.size() ; i++) {
//			list.get(i).printProductInfo();
//		}
	
	}

}
