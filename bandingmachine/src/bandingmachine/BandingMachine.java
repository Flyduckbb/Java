package bandingmachine;

import java.util.Scanner;

public class BandingMachine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int price, cnt, buy, sum = 0;
		boolean n = true;
		String drink[] = {"�ݶ�", "���̴�", "�ֽ�"};
		
		do
		{
			System.out.println("���� ������ �ֽʽÿ�");
			price=scanner.nextInt();
			sum+=price;
			System.out.println("���Ե� �� " + sum);
			
			System.out.println("���ϴ� ������ ��ȣ�� �����ּ���!");
			for(int i=0;i<3;i++)
			{
				System.out.print((i+1) + "." + drink[i] + " ");
			}
			System.out.println();
			cnt=scanner.nextInt();
			
			switch(cnt) 
			{
			case 1:
				while(sum<800)
				{
					System.out.println("���� �� �־��ּ���");
					price=scanner.nextInt();
					sum+=price;
					System.out.println("���Ե� �ݾ��� " + sum);
				}
				if(sum>=800)
				{
					System.out.println(drink[0] + "��ǰ��  ���ŵǾ����ϴ�");
					sum-=700;
					System.out.println("�ܵ��� " + sum + " �Դϴ�.");
					break;
				}
			case 2:
				while(sum<700)
				{
					System.out.println("���� �� �־��ּ���");
					price=scanner.nextInt();
					sum+=price;
					System.out.println("���Ե� �ݾ��� " + sum);
				}
				if(sum>=700)
				{
					System.out.println(drink[0] + "��ǰ��  ���ŵǾ����ϴ�");
					sum-=700;
					System.out.println("�ܵ��� " + sum + " �Դϴ�.");
					break;
				}
			case 3:
				while(sum<900)
				{
					System.out.println("���� �� �־��ּ���");
					price=scanner.nextInt();
					sum+=price;
					System.out.println("���Ե� �ݾ��� " + sum);
				}
				if(sum>=900)
				{
					System.out.println(drink[0] + "��ǰ��  ���ŵǾ����ϴ�");
					sum-=700;
					System.out.println("�ܵ��� " + sum + " �Դϴ�.");
					break;
				}
			default:
				System.out.println("�ٽ� ������ �ּ���");
				break;
			}
			
			if(n==true)
			{
				System.out.println("���Ḧ �߰��� �����Ͻðڽ��ϱ�? -> Y(1), N(0)");
				buy=scanner.nextInt();
		
				if(buy==0)
				{
					System.out.println("�ܵ��� ��ȯ�մϴ� -> �ܵ� : " + sum);
					System.out.println("���Ǳ⸦ �����մϴ�.");
					n=false;
				}
			}
		} while(n);
		
		scanner.close();
	}

}
