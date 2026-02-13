package methodTask;

public class MethodTask {
		
		void print() {
			for(int i = 0; i < 10; i++) {
				System.out.println(i);
			}
		}
		
		int sum(int num) {
			int total = 0;
			for(int i = 0; i < num; i++) {
				total += i+1;
			}
			
			return total;
		}
		
		public static void main(String[] args) {
//	      1. 1~10까지 출력하는 메서드
//	      2. 1~n까지의 합을 반환해주는 메서드
			
			MethodTask mt = new MethodTask();
			mt.print();
			
			System.out.println(mt.sum(111111));
		}
	}