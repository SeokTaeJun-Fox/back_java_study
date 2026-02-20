package classTask;

//PlayerA
//10 170 16 24 35

//PlayerB
//53 22 74 12 13

//클래스 PlayerA
//카드 뽑기
//PlayerB의 카드 중에 가장 큰 수와 가장 작은 수를 뽑아올 수 있는 메서드

//클래스 PlayerB
//카드 뽑기
//PlayerA의 카드 전부 중 모든 숫자의 홀수를 뽑아올 수 있는 메서드

//기존 카드에서도 카드가 사라져야하고, 기존에 카드덱에 추가 되어야됩니다.

//1. 객체화 PlayerA, PlayerB
//2. PlayerA 카드뽑기
//3. PlayerB 카드뽑기
//4. PlayerA 가진 모든 카드를 출력
//5. PlayerB 가진 모든 카드를 출력
class PlayerA {
	String name;
	int[] cards;
	
	public PlayerA() {
		// TODO Auto-generated constructor stub
	}

	public PlayerA(String name, int[] cards) {
		this.name = name;
		this.cards = cards;
	}
	
	int[] pick(PlayerB playerB) {
		int min = playerB.cards[0];
		int max = playerB.cards[0];
		
		for(int num : playerB.cards) {
			if (min > num) {
				min = num;
			}
			
			if (max < num) {
				max = num;
			}
		}
		
		//자신의 카드 추가
		cards = new int[] {cards[0], cards[1], cards[2], cards[3], cards[4], min, max};
		
		return new int[] {min, max};
	}
	
	void removeCard(int[] targets) {
		int[] newCards = new int[cards.length - targets.length];
		int targetIndex = 0;
		for(int i = 0; i < cards.length; i++) {
			boolean isFind = false;
			
			for(int j = 0; j < targets.length; j++) {
				if(cards[i] == targets[j]) {
					isFind = true;
					break;
				}
			}
			
			if(!isFind) {
				newCards[targetIndex] = cards[i];
				targetIndex++;
			}
		}
		
		cards = newCards;
	}
	
	void cardPrint() {
		for(int i = 0; i < cards.length; i++) { 
			System.out.printf("%s님의 %d번째 카드 : %d\n", name, i, cards[i]);			
		}
	}
}

class PlayerB {
	String name;
	int[] cards;
	
	public PlayerB() {
		// TODO Auto-generated constructor stub
	}

	public PlayerB(String name, int[] cards) {
		this.name = name;
		this.cards = cards;
	}
	
	int[] pick(PlayerA playerA) {
		String odds = "";
		String[] oddArray = null;
		int[] myNewCards = null;
		for(int num : playerA.cards) {
			if (num%2 == 1) {
				odds += num;
				odds += "/";
			}
		}
		odds = odds.substring(0, odds.length()-1);
		oddArray = odds.split("\\/");
		myNewCards = new int[cards.length + oddArray.length];
		
		for(int i = 0; i < cards.length; i++) {
			myNewCards[i] = cards[i];
		}
		
		for(int i = 0; i < oddArray.length; i++) {
			myNewCards[cards.length + i] = Integer.parseInt(oddArray[i]);
		}
		
		cards = myNewCards;
		
		int[] output = new int[oddArray.length];
		for(int i = 0; i < output.length; i++) {
			output[i] = Integer.parseInt(oddArray[i]);
		}
		
		return output;
	}
	
	void removeCard(int[] targets) {
		int[] newCards = new int[cards.length - targets.length];
		int targetIndex = 0;
		for(int i = 0; i < cards.length; i++) {
			boolean isFind = false;
			
			for(int j = 0; j < targets.length; j++) {
				if(cards[i] == targets[j]) {
					isFind = true;
					break;
				}
			}
			
			if(!isFind) {
				newCards[targetIndex] = cards[i];
				targetIndex++;
			}
		}
		
		cards = newCards;
	}
	
	void cardPrint() {
		for(int i = 0; i < cards.length; i++) { 
			System.out.printf("%s님의 %d번째 카드 : %d\n", name, i, cards[i]);			
		}
	}
}

public class ClassTask3 {
	
	public static void main(String[] args) {
		PlayerA a = new PlayerA("URA", new int[] {10, 170, 16, 24, 35});
		PlayerB b = new PlayerB("DaNon", new int[] {53, 22, 74, 12, 13});
		
		int[] changeCards1 = a.pick(b);
		b.removeCard(changeCards1);
		
		int[] changeCards2 = b.pick(a);
		a.removeCard(changeCards2);
		
		a.cardPrint();
		b.cardPrint();
	}
}

//강사님 코드
//package classTask;
//
////PlayerA
////10 170 16 24 35
////카드 뽑기
//
//class PlayerA {
//int[] cards = {10, 170, 16, 24, 35};
//
////PlayerB의 카드 중에 가장 큰 수와 가장 작은 수를 뽑아올 수 있는 메서드
//public void takeCard(PlayerB playerB) {
//   int min = playerB.cards[0];
//   int max = playerB.cards[0];
//   
//   for(int i = 0; i < playerB.cards.length; i++) {
//      if(min > playerB.cards[i]) {
//         min = playerB.cards[i];
//      }
//      if(max < playerB.cards[i]) {
//         max = playerB.cards[i];
//      }
//   }
//   
//   // min, max -> 내가 가진 카드에 추가하는 로직
//   addCard(min);
//   addCard(max);
//   
//   removePlayerBCard(min, playerB);
//   removePlayerBCard(max, playerB);
//   
//}
//
//// 카드를 추가하는 메서드
//void addCard(int card) {
//   int[] newCards = new int[this.cards.length + 1];
//   
//   for(int i = 0; i < this.cards.length; i++) {
//      newCards[i] = this.cards[i];
//   }
//   
//   newCards[this.cards.length] = card;
//   this.cards = newCards;
//}
//
//// playerB 카드를 제거하는 메서드
//void removePlayerBCard(int card, PlayerB playerB) {
//   int[] newCards = new int[playerB.cards.length - 1];
//   int index = 0;
//   
//   for(int i = 0; i < playerB.cards.length; i++) {
//      if(playerB.cards[i] != card) {
//         newCards[index] = playerB.cards[i];
//         index++;
//      }
//   }
//   
//   playerB.cards = newCards;
//}
//
//
//void showCards() {
//   String result = "";
//   for(int card: this.cards) {
//      result += String.valueOf(card) + " ";
//   }
//   System.out.println("A: " + result);
//}
//
//
//}
//
//class PlayerB {
//int[] cards = {53, 22, 74, 12, 13};
//
////PlayerA의 카드 전부 중 모든 숫자의 홀수를 뽑아올 수 있는 메서드
//public void takeCard(PlayerA playerA) {
//   for(int i = 0; i < playerA.cards.length; i++) {
//      if(playerA.cards[i] % 2 == 1) {
//         int oddCard = playerA.cards[i];
//         
//         addCard(oddCard);
//         removePlayerACard(oddCard, playerA);
//      }
//   }
//}
//
//// 카드를 추가하는 메서드
//void addCard(int card) {
//   int[] newCards = new int[this.cards.length + 1];
//   
//   for(int i = 0; i < this.cards.length; i++) {
//      newCards[i] = this.cards[i];
//   }
//   
//   newCards[this.cards.length] = card;
//   this.cards = newCards;
//}
//
//// playerA 카드를 제거하는 메서드
//void removePlayerACard(int card, PlayerA playerA) {
//   int[] newCards = new int[playerA.cards.length - 1];
//   int index = 0;
//   
//   for(int i = 0; i < playerA.cards.length; i++) {
//      if(playerA.cards[i] != card) {
//         newCards[index] = playerA.cards[i];
//         index++;
//      }
//   }
//   
//   playerA.cards = newCards;
//}
//
//
//void showCards() {
//   String result = "";
//   for(int card: this.cards) {
//      result += String.valueOf(card) + " ";
//   }
//   System.out.println("B: " + result);
//}
//}
//
//
//public class ClassTask3 {
//public static void main(String[] args) {
//   PlayerA a = new PlayerA();
//   PlayerB b = new PlayerB();
//   a.takeCard(b);
//   a.showCards();
//   b.takeCard(a);
//   b.showCards();
//   a.showCards();
//}
//}


















