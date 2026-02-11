package whileTesk;

import java.util.Scanner;

public class WhileTask {
	public static void main(String[] args) {
//      키오스크 만들기
//      기본 판매 상품
//      아메리카노: 2000원
//      카페라떼: 3000원
      
      Scanner sc = new Scanner(System.in);
      String product1 = "아메리카노", product2 = "카페라떼", product3 = null, product4 = null,
            productName = null,
            message = "기능을 선택하세요.\n"
                  + "1. 상품 등록\n"
                  + "2. 상품 판매\n"
                  + "3. 이름 변경\n"
                  + "4. 가격 변경\n"
                  + "5. 상품 삭제";
      int productPrice = 0, productPrice1 = 2000, productPrice2 = 3000, 
            productPrice3 = 0, productPrice4 = 0, productCount = 2, 
            menuChoice = 0, productChoice = 0;
      
//      1. 상품 등록(4개)
//      2. 상품 판매
//      3. 이름 변경 
//      4. 가격 변경
      
//      등록된 물품을 판매하는 시스템
//      판매가 완료되면 다시 첫 화면으로 돌아오기!
      while(true) {
         System.out.println(message);
         menuChoice = sc.nextInt();
         
         if(menuChoice == 1) {
            if(productCount >= 4) {
               System.out.println("상품 등록 불가");
               continue;
            }
            
            productCount++;
            System.out.println(productCount);
            
            System.out.println("==================");
            if(product1 == null) {
               System.out.println("1. 상품 등록 가능");
            }
            if(product2 == null) {
               System.out.println("2. 상품 등록 가능");
            }
            if(product3 == null) {
               System.out.println("3. 상품 등록 가능");
            }
            if(product4 == null) {
               System.out.println("4. 상품 등록 가능");
            }
            System.out.println("==================");
            System.out.println("상품 등록할 번호를 선택하세요");
            productChoice = sc.nextInt();
            
            System.out.println("상품 이름을 등록하세요.\nex)에이드");
            productName = sc.next();
            System.out.println("상품 가격을 등록하세요.\nex)5000");
            productPrice = sc.nextInt();
            
            switch(productChoice) {
            case 1:
               product1 = productName;
               productPrice1 = productPrice;
               break;
            case 2:
               product2 = productName;
               productPrice2 = productPrice;
               break;
            case 3:
               product3 = productName;
               productPrice3 = productPrice;
               break;
            case 4:
               product4 = productName;
               productPrice4 = productPrice;
               break;
            default:
               break;
            }
         }else if(menuChoice == 2) {
            System.out.println("======판매 상품 목록======");
            if(product1 != null) {
               System.out.println("1. " + product1);
            }
            if(product2 != null) {
               System.out.println("2. " + product2);
            }
            if(product3 != null) {
               System.out.println("3. " + product3);
            }
            if(product4 != null) {
               System.out.println("4. " + product4);
            }
            System.out.println("======판매 상품 목록======");
            
            productChoice = sc.nextInt();
            
            switch(productChoice) {
            case 1:
               System.out.println(product1 + ": "+ productPrice1 + "원");
               break;
            case 2:
               System.out.println(product2 + ": "+ productPrice2 + "원");
               break;
            case 3:
               System.out.println(product3 + ": "+ productPrice3 + "원");
               break;
            case 4:
               System.out.println(product4 + ": "+ productPrice4 + "원");
               break;
            }
            System.out.println("판매 완료");
            
         }else if(menuChoice == 3) {
            System.out.println("======이름 변경 가능 목록======");
            if(product1 != null) {
               System.out.println("1. " + product1);
            }
            if(product2 != null) {
               System.out.println("2. " + product2);
            }
            if(product3 != null) {
               System.out.println("3. " + product3);
            }
            if(product4 != null) {
               System.out.println("4. " + product4);
            }
            System.out.println("======이름 변경 가능 목록======");
            
            productChoice = sc.nextInt();
            
            System.out.println("변경할 이름을 입력하세요.");
            productName = sc.next();
            
            switch(productChoice) {
            case 1:
               product1 = productName;
               break;
            case 2:
               product2 = productName;
               break;
            case 3:
               product3 = productName;
               break;
            case 4:
               product4 = productName;
               break;
            }
            System.out.println("이름 변경 완료");
            
         }else if(menuChoice == 4) {
            System.out.println("======가격 변경 가능 목록======");
            if(product1 != null) {
               System.out.println("1. " + product1);
            }
            if(product2 != null) {
               System.out.println("2. " + product2);
            }
            if(product3 != null) {
               System.out.println("3. " + product3);
            }
            if(product4 != null) {
               System.out.println("4. " + product4);
            }
            System.out.println("======가격 변경 가능 목록======");
            
            productChoice = sc.nextInt();
            
            System.out.println("변경할 가격을 입력하세요.");
            productPrice = sc.nextInt();
            
            switch(productChoice) {
            case 1:
               productPrice1 = productPrice;
               break;
            case 2:
               productPrice2 = productPrice;
               break;
            case 3:
               productPrice3 = productPrice;
               break;
            case 4:
               productPrice4 = productPrice;
               break;
            }
            System.out.println("가격 변경 완료");
         }else if(menuChoice == 5) {
            System.out.println("======상품 삭제 가능 목록======");
            if(product1 != null) {
               System.out.println("1. " + product1);
            }
            if(product2 != null) {
               System.out.println("2. " + product2);
            }
            if(product3 != null) {
               System.out.println("3. " + product3);
            }
            if(product4 != null) {
               System.out.println("4. " + product4);
            }
            System.out.println("======상품 삭제 가능 목록======");
            
            System.out.println("삭제할 상품을 선택하세요.");
            productChoice = sc.nextInt();
            
            switch(productChoice) {
            case 1:
               product1 = null;
               productPrice1 = 0;
               break;
            case 2:
               product2 = null;
               productPrice1 = 0;
               break;
            case 3:
               product3 = null;
               productPrice1 = 0;
               break;
            case 4:
               product4 = null;
               productPrice1 = 0;
               break;
            }
            productCount--;
            System.out.println("상품 삭제 완료");
         }else {
            
         }
         
         
      }
	}
}
