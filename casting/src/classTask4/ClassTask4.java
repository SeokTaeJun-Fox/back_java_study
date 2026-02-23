package classTask4;

import java.util.Scanner;

//- 캐스팅 심화
//Market
//- 필드: 이름
//- 메서드:
//1. 상품 판매
// - 등록된 상품만 판매할 수 있다.
// - 유저가 가진 돈보다 적으면 판매할 수 없다.
// - 유저가 마다의 할인율이 적용된다.
//    1. 비회원 할인율 5% 적용
//    2. 멤버 할인율 30% 적용
// - 등록된 상품의 재고보다 작으면 판매할 수 없다.

//2. 상품 등록
// - 상품 등록은 최대 5개까지만 할 수 있다.
// (즉, 6개를 전달해도 앞에 5개 상품만 등록된다)
// - 마트에 같은 이름의 상품은 등록할 수 없다.
//
//3. 포인트 적립 메서드
// - 회원이 각각 포인트를 가지도록
// - 비회원은 5%
// - 회원은 10%

//4. 만약 비회원이라면
// - 회원이 각각 쿠폰를 가지도록
// - 쿠폰 1장 제공, 쿠폰이 10장이라면 상품 무료!

//Product 상품
// - 필드: 이름, 가격, 재고
//
//MarketMember 
// - 필드: 이름, 전화번호, 돈, 포인트, 쿠폰
//
//MarketNonMember
// - 필드: 이름, 전화번호, 돈, 포인트, 쿠폰
// - 마트 비회원과, 마트 회원을 객체화 시켜 물품을 구매하시오.

//공통 필드로 추상화 작업 필요**
public class ClassTask4 {
	public static void main(String[] args) {
		Market market = new Market("URA마켓", 5);
		Person buyer = new MarketNonMember("비회원 DaNon", "010-1234-5678", 100000, 0, 19);
		Person buyer2 = new MarketMember("회원 URA", "010-1234-5678", 100000, 0, 19);
		Person selectedBuyer = null;
		
//		market.RegisterProduct("붕어빵", 1000, 19);
//		market.RegisterProduct("싸만코", 1500, 9);
//		market.RegisterProduct("물", 2000, 100);
//		market.RegisterProduct("햄버거", 1200, 3);
//		market.RegisterProduct("샌드위치", 2100, 21);
//		market.printProducts();
//		buyer.print();
//		market.Sell(buyer, 4, 3);
//		
//		buyer.print();
//		market.printProducts();
//		market.Sell(buyer, 4, 6);
//		
//		buyer.print();
//		market.printProducts();
//		
//		System.out.println();
//		
//		market.RegisterProduct("싸만코", 1500, 20);
//		market.printProducts();
//		
//		market.Sell(buyer, 4, 6);
//		buyer.print();
//		market.printProducts();
		
		Scanner sc = new Scanner(System.in);
		int input = 0, choice = 0, productAmount = 0, productPrice = 0, buyChoice = 0, buyAmount = 0;
		String strInput = null, productName = null;
		
		while(true) {
			System.out.printf("어서오세요 %s마켓입니다. 사람을 선택하세요. 1번 : 비회원, 2번 : 회원", market.getName());
			input = sc.nextInt();
			if(input == 1) {
				selectedBuyer = buyer;
				break;
			} else if(input == 2) {
				selectedBuyer = buyer2;
				break;
			} else {
				System.out.println("잘못 입력하였습니다.");
			}
		}
		
		
		while(true) {
			System.out.printf("%s님 무엇을 도와드릴까요? 1번 : 상품 등록, 2번 : 상품 구매, 3번 나가기", selectedBuyer.getName());
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("===============================");
				market.printProducts();
				System.out.println("===============================");
				System.out.print("등록할 상품 이름을 쓰시오: ");
				productName = sc.next();
				System.out.print("가격을 쓰시오: ");
				productPrice = sc.nextInt();
				System.out.print("재고를 쓰시오: ");
				productAmount = sc.nextInt();
				market.RegisterProduct(productName, productPrice, productAmount);
				break;
			case 2:
				if(market.getProductTypeCount() == 0) {
					System.out.println("상품이 없습니다.");
				} else {
					System.out.println();
					System.out.println("============================");
					selectedBuyer.print();
					System.out.println("============================");
					market.printProducts();
					System.out.println("============================");
					System.out.println("구매할 상품 번호를 쓰시오");
					buyChoice = sc.nextInt();
					System.out.println("구매할 상품 갯수를 쓰시오");
					buyAmount = sc.nextInt();
					market.Sell(selectedBuyer, buyChoice, buyAmount);
				}
				break;
			case 3:
				return;
			default:
				System.out.println("잘못 입력하였습니다.");
				break;
			}
		}
	}
}
