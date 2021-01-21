package javaExample;

import java.util.Scanner;

public class Num8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int price=1000;
	
		System.out.print("커피 주문하세요>>");
	
		String coffee = sc.next();
		int count = sc.nextInt();
		
		if(coffee.equals("에스프레소"))
		{
			price*=2;
			System.out.print(price*count+"원입니다.");
		}
		else if(coffee.equals("아메리카노"))
		{
			price*=2.5;
			System.out.print(price*count+"원입니다.");
		}
		else if(coffee.equals("카푸치노"))
		{
			price*=3;
			System.out.print(price*count+"원입니다.");
		}
		else if(coffee.equals("카페라떼"))
		{
			price*=3.5;
			System.out.print(price*count+"원입니다.");
		}
	}

}
