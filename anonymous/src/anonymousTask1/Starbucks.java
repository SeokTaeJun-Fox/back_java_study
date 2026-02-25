package anonymousTask1;

public class Starbucks {
// 입점 시 상품을 등록
// Form 인터페이스를 활용
	private String[] menus;
	private String[] freeMenus;

	public Starbucks() {;}

	public Starbucks(String[] menus) {
		this.menus = menus;
	}
	
	public String[] getMenus() {
		return menus;
	}
	

	public String[] getFreeMenus() {
		return freeMenus;
	}

	public void setFreeMenus(String[] freeMenus) {
		this.freeMenus = freeMenus;
	}

	public void setMenus(String[] menus) {
		this.menus = menus;
	}

	public void register(Form form) {
		this.setMenus(form.getMenus());
		this.setFreeMenus(form.getFree());
	}
	
	public void sell(String menu) {
		boolean isFind = false;
		for(String target : this.getMenus()) {
			if(target.equals(menu)) {
				isFind = true;
				break;
			}
		}
		
		boolean isFreeFind = false;
		if(this.getFreeMenus() != null) {
			for(String target : this.getFreeMenus()) {
				if(target.equals(menu)) {
					isFreeFind = true;
					break;
				}
			}
		}
		
		if(isFind) {
			if(isFreeFind) {
				System.out.println("무료행사 진행중");
			} else {
				System.out.println("판매 완료");
			}
		} else {
			System.out.println("해당 메뉴는 없습니다.");
		}
	}
	
	public void sell(String menu, Starbucks starbucks) {
		String[] menus = this.getMenus();
		boolean isSell = false;
		
		for(int i = 0; i < menus.length; i++) {
			
			if(menus[i].equals(menu)) {
				isSell = true;
				if(starbucks instanceof EventMarker) {
					if(menu.equals("아메리카노")) {
						System.out.println("무료 행사 나눔중");
						break;
					}
				}
				System.out.println("판매 완료");
				break;
			} else {
				continue;
			}
		}
		
		if(!isSell) {				
			System.out.println("판매 준비중입니다...");
		}
	}
}
