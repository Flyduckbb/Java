package javaExample_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Num4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char arry[]= {'��','��','ȭ','��','��','��','��'};
	
		while(true)
		try {
			System.out.print("������ �Է��ϼ���>>");
			int day=sc.nextInt();
			int i=day%7;
			if(day<0)
			{
				System.out.print("���α׷� �����մϴ�....");
				break;			
			}
			System.out.println(arry[i]);
		}
		catch(InputMismatchException e) {
			System.out.println("���! ���� �Է����� �ʾҽ��ϴ�");
			sc.nextLine();
		}
		
		sc.close();
	}

}
