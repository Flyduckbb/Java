package javaExample;

import java.util.Scanner;

public class Num4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� (x,y)�� ��ǥ�� �Է��ϼ���>>");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(50<=x && x<=100)
		{
			if(50<=y && y<=100)
				System.out.println("�� ("+ x + "," + y + ") �� (50,50)�� (100,100)�� �簢�� ���� �ֽ��ϴ�.");
			else
				System.out.println("������ ������ϴ�.");
		}
		else
			System.out.println("������ ������ϴ�.");
	}

}
