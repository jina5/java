package test2.vo;

public class ProductVO {
	
	public String num; //제품번호
	public String name; //제품명
	public String cop; //제조사
	public int stock; //재고 
	public String house; //창고위치
	
	
	public ProductVO(String num, String name, String cop, int stock, String house) {
		super();
		this.num = num;
		this.name = name;
		this.cop = cop;
		this.stock = stock;
		this.house = house;
	}
	public void printProductInfo() {
		System.out.print("학번 : " + num);
		System.out.print("이름 : " + name);
		System.out.print("제조사 : " + cop);
		System.out.print("재고 : " + stock);
		System.out.println("창고위치 : " + house);

	}


	public String getNum() {
		return num;
	}


	public void setNum(String num) {
		this.num = num;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCop() {
		return cop;
	}


	public void setCop(String cop) {
		this.cop = cop;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public String getHouse() {
		return house;
	}


	public void setHouse(String house) {
		this.house = house;
	}
	
	@Override 
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(obj == this) return true;
		
		if(obj instanceof String) {
			return num.equals(obj); 
		}
		else if (obj instanceof ProductVO) {
			return num.equals(((ProductVO)obj).getNum());
		}
		return super.equals(obj);
	}
}
