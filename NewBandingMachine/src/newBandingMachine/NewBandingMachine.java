package newBandingMachine;

public class NewBandingMachine {

	public static void main(String[] args) {
		Buy buy = new Buy();
		Compare_Price price = new Compare_Price();
		
		do{
			buy.input_money(price.change);
			buy.show_menu();
			price.choose_menu(buy.stack_money);
		}while(buy.n);
		
		buy.sc.close();
	}
}
