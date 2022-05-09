package test2.service;

import java.util.ArrayList;

import test2.vo.ProductVO;

public class ProductService {
	private static ProductService instance = new ProductService();

	private static ArrayList<ProductVO> list;

	private ProductService() {
		list = new ArrayList<ProductVO>();
		list.add(new ProductVO("000123", "ABC123", "LG", 30, "서울"));
		list.add(new ProductVO("012333", "DAD588", "삼성", 100, "부산"));
	}

	public static ProductService getInstance() {
		if (instance == null)
			instance = new ProductService();
		return instance;
	}

	public void RegisterStudent(ProductVO productVO) {
		list.add(productVO);
	}

	public ArrayList<ProductVO> getList() {
		return list;
	}

	public static void setList(ArrayList<ProductVO> list) {
		ProductService.list = list;
	}

	public static void setInstance(ProductService instance) {
		ProductService.instance = instance;
	}

	public ProductVO SearchProduct(String num) {
		for(int i = 0; i<list.size();i++) {
			if(list.get(i).getNum().equals(num))
				return list.get(i);
		}
		return null;
	}
	

}
