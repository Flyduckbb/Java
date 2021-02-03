package helloSoft;

import java.util.Scanner;

public class HelloSoft {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int price, num, buy, sum = 0;
		boolean again = true;
		int beverage[]= {700, 900, 500};
		
		do{
			System.out.println("원하는 읍료에 해당하는 숫자를 눌러주세요 !");
			System.out.println("1.코카콜라  2.스프라이트  3.환타  4.솔의눈");	
			num = scanner.nextInt();
			
			System.out.println("돈을 넣어주세요 !");
			System.out.println("현재 금액 : " + sum);
			price = scanner.nextInt();
			sum+=price;
			if(sum==0)
				{
					System.out.println("자판기가 종료됩니다.");
					again=false;
					break;
				}
				
			switch(num)
			{
			case 1:
				while(sum<beverage[0])
				{
						System.out.println("코카콜라  -> 700원");
						System.out.println("현재 금액 : " + sum);
						System.out.println("돈을 더 넣어주세요!");
						price = scanner.nextInt();
						sum+=price;
						if(sum>=beverage[0]) break;
					}
						sum-=beverage[0];
						System.out.println("해당 제품이 구매완료 되었습니다.");
						System.out.println("잔액은 " + sum + "입니다");
						break;
				case 2:
					while(sum<beverage[1])
					{
						System.out.println("스프라이트 -> 900원");
						System.out.println("현재 금액 : " + sum);
						System.out.println("돈을 더 넣어주세요!");
						price = scanner.nextInt();
						sum+=price;
						if(sum>=beverage[1]) break;
					}
						sum-=beverage[1];
						System.out.println("해당 제품이 구매완료 되었습니다.");
						System.out.println("잔액은 " + sum + "입니다");
						break;
				case 3:
					while(sum<beverage[2])
					{
						System.out.println("환타 -> 500원");
						System.out.println("현재 금액 : " + sum);
						System.out.println("돈을 더 넣어주세요!");
						price = scanner.nextInt();
						sum+=price;
						if(sum>=beverage[2]) break;
					}
						sum-=beverage[2];
						System.out.println("해당 제품이 구매완료 되었습니다.");
						System.out.println("잔액은 " + sum + "입니다");
						break;
				default:
					break;
			}
			if(again==true)
			{
				System.out.println("음료를 추가로 구매하시겠습니까? -> Y(1), N(0)");
				buy=scanner.nextInt();
		
				if(buy==0)
				{
					System.out.println(sum + " 남은 돈이 반환됩니다.");
					System.out.println("자판기를 종료합니다.");
					again=false;
				}
			}
		} while(again);
		
		scanner.close();
	}
}