package newBandingMachine;

class Compare_Price extends Buy{	
	int total_money;
	int change;
	
	public void choose_menu(int x) {
		this.total_money=0;
		this.total_money += x;

		System.out.println("���ϴ� �޴��� ������ �ش��ϴ� ��ȣ�� �����ּ���");
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
			System.out.println("�ٽ� �������ּ���");
			System.out.println("ó������ ���ư��ϴ�");
			change=total_money;
			break;
		}
	}
}
