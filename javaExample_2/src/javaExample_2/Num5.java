package javaExample_2;

import java.util.Scanner;

public class Num5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 10개 입력>>");
		int arry[]= new int [10];
		
		for(int i=0;i<10;i++)
			arry[i]=sc.nextInt();
			
		
		for(int j=1; j<10; j++)
		{
			for(int i=1;i<10;i++)
			{
				if(arry[i-1]>arry[i])
				{
					int a=arry[i];
					arry[i]=arry[i-1];
					arry[i-1]=a;
				}
			}
		}
		
		for(int i=0; i<10; i++)
			System.out.print(arry[i]+" ");
		
	}

}
