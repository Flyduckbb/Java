package newBandingMachine;

class Item extends Compare_Price {
	int item_price;

	public Item(int price) {
		System.out.println(menu[0] + "의 가격 : " + price);
		this.item_price=price;
	}
	
	public void compare(int total_money) {
		this.total_money = total_money;
		
		while(true) {
			if(this.total_money<this.item_price) {
				System.out.println("금액이 적습니다. 다시 넣어주세요");
				money = sc.nextInt();
				this.total_money += money;
			}
			else{
				change=this.total_money-this.item_price;
				System.out.println("제품이 나왔습니다.");
				System.out.println("잔돈 : " + change);
				break;
			}
		}
	}
}
