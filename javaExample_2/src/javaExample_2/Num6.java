package javaExample_2;

import java.util.Scanner;

public class Num6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String eng[] = {"student", "love", "java", "happy", "future"};
		String kor[] = {"�л�", "���", "�ڹ�", "�ູ", "�̷�"};
		
		while(true)
		{
			System.out.print("���� �ܾ �Է��ϼ���>>");
			String e = sc.next();
			
			if(e.equals("exit"))
			{
				System.out.print("�����մϴ�....");
				sc.close();
				break;
			}
			
			for(int i=0; i<eng.length; i++)
			{
				if(e.equals(eng[i]))
				{
					System.out.println(kor[i]);
					break;
				}
				else if(!e.equals(eng[i]) && i==4)
				{
					System.out.println("�׷� ���� �ܾ �����ϴ�.");
					break;
				}
			}

		}
	}
}
