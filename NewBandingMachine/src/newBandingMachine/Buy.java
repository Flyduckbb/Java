package newBandingMachine;

import java.util.Scanner;

class Buy {
	Scanner sc = new Scanner(System.in);
	
	boolean n=true;
	int money;
	int stack_money;
	String menu[] = {"�ݶ�", "���̴�", "ȯŸ", "��Ű��"};
	int menu_num=0;
	
	public void input_money (int change) {
		this.stack_money = 0;
		this.stack_money = change;
		System.out.println("���� �־��ּ���");
		this.money=sc.nextInt();
		this.stack_money += this.money;
		System.out.println("���Ե� �ݾ� : " + this.stack_money);
	}
	
	public void show_menu() {
		for(int i=0; i<menu.length; i++)
			System.out.print(menu[i] + "  ");
		System.out.println();
	}
}
