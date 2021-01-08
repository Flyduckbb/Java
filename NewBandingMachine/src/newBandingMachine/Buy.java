package newBandingMachine;

import java.util.Scanner;

class Buy {
	Scanner sc = new Scanner(System.in);
	
	boolean n=true;
	int money;
	int stack_money;
	String menu[] = {"콜라", "사이다", "환타", "밀키스"};
	int menu_num=0;
	
	public void input_money (int change) {
		this.stack_money = 0;
		this.stack_money = change;
		System.out.println("돈을 넣어주세요");
		this.money=sc.nextInt();
		this.stack_money += this.money;
		System.out.println("투입된 금액 : " + this.stack_money);
	}
	
	public void show_menu() {
		for(int i=0; i<menu.length; i++)
			System.out.print(menu[i] + "  ");
		System.out.println();
	}
}
