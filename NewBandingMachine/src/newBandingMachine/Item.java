package newBandingMachine;

class Item extends Compare_Price {
	int item_price;

	public Item(int price) {
		System.out.println(menu[0] + "�� ���� : " + price);
		this.item_price=price;
	}
	
	public void compare(int total_money) {
		this.total_money = total_money;
		
		while(true) {
			if(this.total_money<this.item_price) {
				System.out.println("�ݾ��� �����ϴ�. �ٽ� �־��ּ���");
				money = sc.nextInt();
				this.total_money += money;
			}
			else{
				change=this.total_money-this.item_price;
				System.out.println("��ǰ�� ���Խ��ϴ�.");
				System.out.println("�ܵ� : " + change);
				break;
			}
		}
	}
}
