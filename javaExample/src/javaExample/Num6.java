package javaExample;

import java.util.Scanner;

public class Num6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �׼��� �Է��ϼ���>>");
		int won_50000 = 0, won_10000=0, won_1000=0, won_500=0, won_100=0, won_10=0, won_1=0, change = 0;
		int price = sc.nextInt();
		

			if(price>=50000)
			{
				won_50000=price/50000;
				price=price%50000;
				System.out.print("������" + won_50000 +"�� ");
			}
			else
			{
				won_50000=0;
				System.out.print("������" + won_50000 +"�� ");
			}
			
			if(price>=10000)
			{
				won_10000=price/10000;
				price=price%10000;
				System.out.print("����" + won_10000 +"�� ");
			}
			else
			{
				won_1000=0;
				System.out.print("����" + won_1000 +"�� ");
			}
			
			if(price>=1000)
			{
				won_1000=price/1000;
				price=price%1000;
				System.out.print("õ��" + won_1000+"�� ");
			}
			else
			{
				won_1000=0;
				System.out.print("õ��" + won_1000 +"�� ");
			}
			
			if(price>=500)
			{
				won_500=price/500;
				price=price%500;
				System.out.print("500��" + won_500 +"�� ");
			}
			else
			{
				won_500=0;
				System.out.print("500��" + won_500 +"�� ");
			}
			
			if(price>=100)
			{
				won_100=price/100;
				price=price%100;
				System.out.print("100��" + won_100 +"�� ");
			}
			else
			{
				won_100=0;
				System.out.print("100��" + won_100 +"�� ");
			}
			
			if(price>=10)
			{
				won_10=price/10;
				price=price%10;
				System.out.print("10��" + won_10 +"�� ");
			}
			else
			{
				won_10=0;
				System.out.print("10��" + won_10 +"�� ");
			}
			
			if(price>=1)
			{
				won_1=price;
				System.out.print("1��" + won_1 +"�� ");
			}	
	}
}
