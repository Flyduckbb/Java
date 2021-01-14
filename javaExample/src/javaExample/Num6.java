package javaExample;

import java.util.Scanner;

public class Num6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("돈의 액수를 입력하세오>>");
		int won_50000 = 0, won_10000=0, won_1000=0, won_500=0, won_100=0, won_10=0, won_1=0, change = 0;
		int price = sc.nextInt();
		

			if(price>=50000)
			{
				won_50000=price/50000;
				price=price%50000;
				System.out.print("오만원" + won_50000 +"개 ");
			}
			else
			{
				won_50000=0;
				System.out.print("오만원" + won_50000 +"개 ");
			}
			
			if(price>=10000)
			{
				won_10000=price/10000;
				price=price%10000;
				System.out.print("만원" + won_10000 +"개 ");
			}
			else
			{
				won_1000=0;
				System.out.print("만원" + won_1000 +"개 ");
			}
			
			if(price>=1000)
			{
				won_1000=price/1000;
				price=price%1000;
				System.out.print("천원" + won_1000+"개 ");
			}
			else
			{
				won_1000=0;
				System.out.print("천원" + won_1000 +"개 ");
			}
			
			if(price>=500)
			{
				won_500=price/500;
				price=price%500;
				System.out.print("500원" + won_500 +"개 ");
			}
			else
			{
				won_500=0;
				System.out.print("500원" + won_500 +"개 ");
			}
			
			if(price>=100)
			{
				won_100=price/100;
				price=price%100;
				System.out.print("100원" + won_100 +"개 ");
			}
			else
			{
				won_100=0;
				System.out.print("100원" + won_100 +"개 ");
			}
			
			if(price>=10)
			{
				won_10=price/10;
				price=price%10;
				System.out.print("10원" + won_10 +"개 ");
			}
			else
			{
				won_10=0;
				System.out.print("10원" + won_10 +"개 ");
			}
			
			if(price>=1)
			{
				won_1=price;
				System.out.print("1원" + won_1 +"개 ");
			}	
	}
}
