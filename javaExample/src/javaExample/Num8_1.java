package javaExample;

import java.util.Scanner;

public class Num8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int price=1000;
		int a = 0;
		System.out.print("Ŀ�� �ֹ��ϼ���>>");
		String coffee = sc.next();
		int cnt = sc.nextInt();
		
		if(coffee.equals("����������"))
			a=1;
		if(coffee.equals("�Ƹ޸�ī��"))
			a=2;
		if(coffee.equals("īǪġ��"))
			a=3;
		if(coffee.equals("ī���"))
			a=4;
		
		switch(a)
		{
		case 1:
			price*=2;
			System.out.print((price*cnt) + "���Դϴ�.");
			break;
			
		case 2:
			price*=2.5;
			System.out.print((price*cnt) + "���Դϴ�.");
			break;
			
		case 3:
			price*=3;
			System.out.print((price*cnt) + "���Դϴ�.");
			break;
			
		case 4:
			price*=3.5;
			System.out.print((price*cnt) + "���Դϴ�.");
			break;
		}
	}

}
