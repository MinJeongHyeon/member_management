package shopping_mall;

/**
@name Product.java
@title 프로덕트 객체
@detail 각 프로덕트 객체를 생성하는 클래스
@author 김동엽
@since 2021.06.03
@version 1.0
============edit log============
Date - Author - Note
2021.06.03 - 김동엽 - 초안 작성

*/

public class Product {
	
	private int id;
	private String productName;
	private int price;
	private int amount;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	

}
