package anonymousTask1;

//오픈
//역삼점
//- 아메리카노, 녹차라떼, 애플민트티
//
//신촌점
//- 아메리카노, 자몽허니블랙티, 자몽에이드
//
//
//1. 역삼점과 강남점은 아메리카노 무료행사 진행중
//2. 사용자가 sell() 메뉴를 판매하면 역삼점과 강남점의 아메리카노는 무료행사 진행중을 출력
//그 외 지점은 판매완료를 출력
public class Building {
	public static void main(String[] args) {
		GangNam gangnam = new GangNam();
		YeokSam yeoksam = new YeokSam();
		Sinchon shinchon = new Sinchon();
		Jamsil jamsil = new Jamsil();
		
		gangnam.register(new Form() {
			
			@Override
			public String[] getMenus() {
				return new String[] {"아메리카노", "카페라떼", "녹차라뗴", "바닐라 콜드브루"};
			}

			@Override
			public String[] getFree() {
				return new String[] {"아메리카노"};
			}
		});
		
		jamsil.register(new Form() {
			
			@Override
			public String[] getMenus() {
				return new String[] {"아메리카노", "에이드", "디카페인 아메리카노"};
			}
			
			@Override
			public String[] getFree() {
				return null;
			}
		});
		
		yeoksam.register(new Form() {
			
			@Override
			public String[] getMenus() {
				return new String[] {"아메리카노", "녹차라떼", "애플민트티"};
			}
			
			@Override
			public String[] getFree() {
				return new String[] {"아메리카노"};
			}

		});
		
		shinchon.register(new Form() {
			
			@Override
			public String[] getMenus() {
				return new String[] {"아메리카노", "자몽허니블랙티", "자몽에이드"};
			}
			
			@Override
			public String[] getFree() {
				return null;
			}

		});
	
		shinchon.sell("자몽허니블랙티",shinchon);
		yeoksam.sell("아메리카노", yeoksam);
		jamsil.sell("아메리카노", jamsil);
		gangnam.sell("아메리카노", gangnam);
		
		
	}
}
