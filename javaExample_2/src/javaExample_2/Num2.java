package javaExample_2;

import java.util.Scanner;

public class Num2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int ary[]= new int[10];
		int num;
		
		System.out.print("정수 10개 입력>>");
		
		for(int i=0; i<10; i++)
		{
			num=sc.nextInt();
			ary[i]=num;
		}
		
		for(int j=0; j<=9; j++)
		{
			if(ary[j]%3==0)
			{
				System.out.print(ary[j]+" ");
			}
		}
		
		sc.close();
	}

}
