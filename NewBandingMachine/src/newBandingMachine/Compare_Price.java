package newBandingMachine;

class Compare_Price extends Buy{	
	int total_money;
	int change;
	
	public void choose_menu(int x) {
		this.total_money=0;
		this.total_money += x;

		System.out.println("원하는 메뉴의 순서에 해당하는 번호를 눌러주세요");
		this.menu_num=sc.nextInt();
		
		switch(menu_num)
		{
		case 1:
			Item coke = new Item(800);
			coke.compare(total_money);
			break;
			
		case 2:
			Item cider = new Item(700);
			cider.compare(total_money);
			break;
			
		case 3:
			Item fanta = new Item(500);
			fanta.compare(total_money);
			break;
			
		case 4:
			Item milkiss = new Item(600);
			milkiss.compare(total_money);
			break;
			
		default:
			System.out.println("다시 선택해주세요");
			System.out.println("처음으로 돌아갑니다");
			change=total_money;
			break;
		}
	}
}
