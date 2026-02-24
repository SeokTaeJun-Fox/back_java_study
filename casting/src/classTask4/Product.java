package classTask4;

public class Product {
	private String name;
	private int price;
	private int amount;
	
	public Product(String name, int price, int amount) {
		this.name = name;
		this.price = price;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

//public class Product {
////  필드: 이름, 가격, 재고
//  String productName;
//  int productPrice;
//  int productStock;
//  
//  public Product() {;}
//  public Product(String productName, int productPrice, int productStock) {
//     this.productName = productName;
//     this.productPrice = productPrice;
//     this.productStock = productStock;
//  }
//  
//  public String getProductName() {
//     return productName;
//  }
//  public void setProductName(String productName) {
//     this.productName = productName;
//  }
//  public int getProductPrice() {
//     return productPrice;
//  }
//  public void setProductPrice(int productPrice) {
//     this.productPrice = productPrice;
//  }
//  public int getProductStock() {
//     return productStock;
//  }
//  public void setProductStock(int productStock) {
//     this.productStock = productStock;
//  }
//}

