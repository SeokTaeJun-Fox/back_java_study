package ifTask;

import java.util.Scanner;

public class IfTask {
	public static void main(String[] args) {
//      거스름돈 계산하기
//      1번 상품: 코카콜라 - 2000원
//      2번 상품: 팹시 - 1500원
//      3번 상품: 맥콜 - 1000원

//      가진돈은 10000
//      사용자가 하나의 상품을 선택하고 구매개수를 입력해서
//      거스름돈을 계산하는 로직을 완성하시오
//      출력 예시)
//      구매상품: 콜라 2개
//      판매가격: 4000원
//      거스름돈: 6000원
		
		String cola = null, pepsi = null, mac = null, choice = null,
				buyFormat = null, sellFormat = null, remainFormat = null;
		int colaPrice = 0, pepsiPrice = 0, macPrice = 0, money = 0, amount = 0, sellPrice = 0;
		
		Scanner sc = new Scanner(System.in);
		
		cola = "코카콜라";
		pepsi = "펩시";
		mac = "맥콜";
		colaPrice = 2000;
		pepsiPrice = 1500;
		macPrice = 1000;
		
		buyFormat = "구매상품 : %s %d개\n";
		sellFormat = "판매가격 : %d원\n";
		remainFormat = "거스름돈 : %d원\n";
		
		money = 10000;
		
		System.out.print("구매상품, 구매개수를 입력하세요 : (ex: 코카콜라 2)");
		
		choice = sc.next();
		amount = sc.nextInt();
		
		switch(choice) {
			case "코카콜라": {
				sellPrice = colaPrice * amount;
				if(money < sellPrice) {
					System.out.println("잔액이 부족합니다.");
					return;
				} else {
					sellPrice = colaPrice * amount;
					money -= sellPrice;
				}
			}
			break;
			
			case "펩시": {
				sellPrice = pepsiPrice * amount;
				if(money < sellPrice) {
					System.out.println("잔액이 부족합니다.");
					return;
				} else {
					sellPrice = pepsiPrice * amount;
					money -= sellPrice;
				}
			}
			break;
			
			case "맥콜": {
				sellPrice = macPrice * amount;
				if(money < sellPrice) {
					System.out.println("잔액이 부족합니다.");
					return;
				} else {
					sellPrice = macPrice * amount;
					money -= sellPrice;
				}
			}
			break;
			
			default: {
				System.out.println("상품을 잘못 입력하셨습니다.");
				return;
			}
		}
		
		System.out.printf(buyFormat, choice, amount);
		System.out.printf(sellFormat, sellPrice);
		System.out.printf(remainFormat, money);
	}
}
