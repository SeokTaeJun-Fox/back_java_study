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
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	public int getProductTypeCount() {
		return products == null ? 0 : products.length;
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

//public class Market {
//	   private String marketName;
//	   private Product[] products;
//	   
//	   {
//	      this.products = new Product[5];
//	   }
//	   
//	   public Market() {;}
//	   public Market(String marketName) {
//	      super();
//	      this.marketName = marketName;
//	   }
//	   
//	   public String getMarketName() {
//	      return marketName;
//	   }
//	   public void setMarketName(String marketName) {
//	      this.marketName = marketName;
//	   }
//	   public Product[] getProducts() {
//	      return products;
//	   }
//	   public void setProducts(Product[] products) {
//	      this.products = products;
//	   }
//	   
//	   public void registerProduct(Product product) {
//	      Product[] products = this.getProducts();
//	      
//	      for(int i = 0; i < products.length; i++) {
//	         Product registeredProduct = products[i];
//	         
//	         // null이면 상품 등록이 가능!
//	         if(registeredProduct == null) {
//	            // 상품이 추가될 때 기존에 있는 상품이 다음에 등록된 상품과 이름이 겹치는지 확인해서
//	            // 기존에 있는 상품이라면 등록하지 않게한다.
//	            boolean flag = false;
//	            for(int j = 0 ; j < products.length; j++) {
//	               if(products[j] != null && products[j].getProductName().equals(product.getProductName())) {
//	                  flag = true;
//	               }
//	            }
//	            if(flag) { break; }
//	            products[i] = product;
//	         }
//	      }
//	      System.out.println("상품 등록이 완료되었습니다.");
//	   }
//	   
//	   public void registerProducts(Product[] products) {
//	      this.setProducts(products);
//	      System.out.println("상품 등록이 완료되었습니다.");
//	   }
//	   
//	   public void sell(String name, int stock, MarketCustomer marketCustomer) {
//	      Product[] products = this.getProducts();
//	      Product product = null;
//	      int totalPrice = 0, discount = 0;
//	      
////	      상품 목록을 가져와서, 구매하려는 상품을 product에 담는다
//	      for(int i = 0; i < this.getProducts().length; i++) {
//	         if(products[i] != null && products[i].getProductName().equals(name)) {
//	            product = products[i];
//	         }
//	      }
//	      
////	      상품의 재고보다 클 때에만 판매 아니면 메서드 종료
//	      if(product.getProductStock() < stock) {
//	         System.out.println("재고 부족\n상품을 판매할 수 없습니다.");
//	         return;
//	      }
//	      
//	      totalPrice = product.getProductPrice() * stock;
//	      
////	      멤버별 차등 할인율 적용
//	      if(marketCustomer instanceof MarketMember) {
//	         discount = 30;
//	      }else {
//	         discount = 5;
//	      }
//
////	      할인율 계산
//	      totalPrice = (int)(totalPrice * ((100 - discount) / 100.0));
//	      
////	      사용자의 돈을 차감
//	      marketCustomer.setCustomerMoney(marketCustomer.getCustomerMoney() - totalPrice);
//	      
////	      상품의 재고 차감
//	      product.setProductStock(product.getProductStock() - stock);
//	      
////	      쿠폰 적립
////	      rewardCoupon
//	      this.rewardCoupon(marketCustomer);
//	      this.rewardPoint(marketCustomer, totalPrice);
//	      
////	      포인트 적립 
////	      rewardPoint
//	      System.out.println("판매가 완료되었습니다.");
//	   };
//	   
//	//   판매중인 마켓의 상품을 보여주는 메서드 
//	   public void showProducts() {
//	      String result = "";
//	      for(Product product: this.getProducts()) {
//	         if(product == null) {
//	            break;
//	         }
//	         result += product.getProductName() + " ";
//	      }
//	      System.out.println(result);
//	   }
//	   
//	//   쿠폰 적립
//	   public void rewardCoupon(MarketCustomer marketCustomer) {
//	      if(marketCustomer instanceof MarketNonMember) {
//	         marketCustomer.setCustomerCoupon(marketCustomer.getCustomerCoupon() + 1);
//	      }
//	   }
//	   
//	//   포인트 적립
//	   public void rewardPoint(MarketCustomer marketCustomer, int productPrice) {
////	      - 비회원은 5%
////	      - 회원은 10%
//	      int point = 0;
//	      if(marketCustomer instanceof MarketMember) {
//	         point = (int)Math.floor(productPrice * 0.1);
//	      }else {
//	         point = (int)Math.floor(productPrice * 0.05);
//	      }
//	      marketCustomer.setCustomerPoint(marketCustomer.getCustomerPoint() + point);
//	   }
//	}

