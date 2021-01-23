package javaExample;

import java.util.Scanner;

public class Num8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int price=1000;
		int a = 0;
		System.out.print("커피 주문하세요>>");
		String coffee = sc.next();
		int cnt = sc.nextInt();
		
		if(coffee.equals("에스프레소"))
			a=1;
		if(coffee.equals("아메리카노"))
			a=2;
		if(coffee.equals("카푸치노"))
			a=3;
		if(coffee.equals("카페라떼"))
			a=4;
		
		switch(a)
		{
		case 1:
			price*=2;
			System.out.print((price*cnt) + "원입니다.");
			break;
			
		case 2:
			price*=2.5;
			System.out.print((price*cnt) + "원입니다.");
			break;
			
		case 3:
			price*=3;
			System.out.print((price*cnt) + "원입니다.");
			break;
			
		case 4:
			price*=3.5;
			System.out.print((price*cnt) + "원입니다.");
			break;
		}
	}

}
