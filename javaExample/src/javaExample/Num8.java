package javaExample;

import java.util.Scanner;

public class Num8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int price=1000;
	
		System.out.print("Ŀ�� �ֹ��ϼ���>>");
	
		String coffee = sc.next();
		int count = sc.nextInt();
		
		if(coffee.equals("����������"))
		{
			price*=2;
			System.out.print(price*count+"���Դϴ�.");
		}
		else if(coffee.equals("�Ƹ޸�ī��"))
		{
			price*=2.5;
			System.out.print(price*count+"���Դϴ�.");
		}
		else if(coffee.equals("īǪġ��"))
		{
			price*=3;
			System.out.print(price*count+"���Դϴ�.");
		}
		else if(coffee.equals("ī���"))
		{
			price*=3.5;
			System.out.print(price*count+"���Դϴ�.");
		}
	}

}
