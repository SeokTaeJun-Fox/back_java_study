package classTask4;

public class Market {
	private Product[] products;
	private String name;
	private int limitProductTypeAmount;

	public Market() {
		// TODO Auto-generated constructor stub
	}
	
	public Market(String name, int limitProductTypeAmount) {
		this.name = name;
		this.limitProductTypeAmount = limitProductTypeAmount;
	}

	//getter, setter
	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}
	
	public int getLimitProductTypeAmount() {
		return limitProductTypeAmount;
	}
	//getter, setter end

	public void setLimitProductTypeAmount(int limitProductTypeAmount) {
		this.limitProductTypeAmount = limitProductTypeAmount;
	}
	
	public void RegisterProduct(String name, int price, int amount) {
		boolean isFind = false;
		if(products != null) {
			for(Product target : products) {
				if(target.getName().equals(name)) {
					isFind = true;
					break;
				}
			}
		}
		
		//등록된상품이 기존 상품이 있다면
		if(isFind) {
			System.out.println("기존 상품이 있으므로 등록할 수 없습니다.");
		} else {
			
			if(products == null) {
				products = new Product[] {new Product(name, price, amount)};
				return;
			}
			
			//상품 등록
			//새로운 배열을 추가해 1번인덱스부터 기존 상품을 채운다. (새로운 배열 제한크기 5)
			//새로운 배열 0번인덱스는 새로운 상품을 추가한다.
			int productsSize = products.length == limitProductTypeAmount ? 5 : products.length + 1;
			Product[] newProducts = new Product[productsSize];
			Product newProduct = new Product(name, price, amount);
			
			for(int i = 0; i < newProducts.length - 1; i++) {
				newProducts[i+1] = products[i];
			}
			
			newProducts[0] = newProduct;
			products = newProducts;
		}
	}
	
	public void Sell(Person buyer, int sellNumber, int amount) {
		if(sellNumber > products.length || sellNumber < 0) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		if(amount > products[sellNumber - 1].getAmount() || amount <= 0) {
			System.out.println("물품 갯수를 잘못 입력하셨습니다.");
			return;
		}
		
		int pay = 0, payAmount = 0, payCoupon = 0;
		Product targetProduct = products[sellNumber-1];
		payAmount = (amount - buyer.getCoupon()/10) <= 0 ? 0 : amount - buyer.getCoupon()/10;
		pay = targetProduct.getPrice() * payAmount;
		payCoupon = (amount - payAmount) * 10;
		
		if(buyer.getMoney() < pay) {
			System.out.println("잔액이 부족합니다.");
		} else {
			
			//구매비용 차감
			buyer.setMoney(buyer.getMoney() - pay);
			
			//포인트 증가
			double saveRate = buyer instanceof MarketMember ? 0.05 : 0.03;
			int save = (int)(saveRate * pay);
			buyer.savePoint(save);
			System.out.println("구매 완료 가격 : " + pay + " 포인트 : " + save + "점 적립");
			
			//쿠폰 갱신
			buyer.setCoupon(buyer.getCoupon() + payAmount - payCoupon);
			System.out.println("쿠폰" + payAmount + "개 적립");
			
			targetProduct.setAmount(targetProduct.getAmount() - amount);
			if(targetProduct.getAmount() == 0) {
				updateProducts();//상품 갱신
			}
		}
	}
	
	//재고 갯수 0개인 물품 배열에서 삭제
	private void updateProducts() {
		while(true) {
			boolean isFind = false;
			for(Product product : products) {
				if(product.getAmount() == 0) {
					isFind = true;
				}
			}
			
			if(isFind) {
				Product[] newProducts = new Product[products.length - 1];
				int index = 0;
				for(Product product : products) {
					if(product.getAmount() == 0) {
						continue;
					} else {
						newProducts[index] = product;
						index++;
					}
				}
				
				products = newProducts;
				
			} else {
				return;
			}
		}
	}
	
	public void printProducts() {
		
		if(products == null) {
			return;
		}
		
		for(int i = 0; i < products.length; i++) {
			System.out.printf("%d번 상품 이름 : %s, 상품 가격 : %d, 남은 재고 : %d\n", i+1, products[i].getName(), products[i].getPrice(), products[i].getAmount());
		}
	}
}
