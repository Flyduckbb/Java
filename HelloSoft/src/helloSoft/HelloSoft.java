package helloSoft;

import java.util.Scanner;

public class HelloSoft {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int price, num, buy, sum = 0;
		boolean again = true;
		int beverage[]= {700, 900, 500};
		
		do{
			System.out.println("���ϴ� ���ῡ �ش��ϴ� ���ڸ� �����ּ��� !");
			System.out.println("1.��ī�ݶ�  2.��������Ʈ  3.ȯŸ  4.���Ǵ�");	
			num = scanner.nextInt();
			
			System.out.println("���� �־��ּ��� !");
			System.out.println("���� �ݾ� : " + sum);
			price = scanner.nextInt();
			sum+=price;
			if(sum==0)
				{
					System.out.println("���ǱⰡ ����˴ϴ�.");
					again=false;
					break;
				}
				
			switch(num)
			{
			case 1:
				while(sum<beverage[0])
				{
						System.out.println("��ī�ݶ�  -> 700��");
						System.out.println("���� �ݾ� : " + sum);
						System.out.println("���� �� �־��ּ���!");
						price = scanner.nextInt();
						sum+=price;
						if(sum>=beverage[0]) break;
					}
						sum-=beverage[0];
						System.out.println("�ش� ��ǰ�� ���ſϷ� �Ǿ����ϴ�.");
						System.out.println("�ܾ��� " + sum + "�Դϴ�");
						break;
				case 2:
					while(sum<beverage[1])
					{
						System.out.println("��������Ʈ -> 900��");
						System.out.println("���� �ݾ� : " + sum);
						System.out.println("���� �� �־��ּ���!");
						price = scanner.nextInt();
						sum+=price;
						if(sum>=beverage[1]) break;
					}
						sum-=beverage[1];
						System.out.println("�ش� ��ǰ�� ���ſϷ� �Ǿ����ϴ�.");
						System.out.println("�ܾ��� " + sum + "�Դϴ�");
						break;
				case 3:
					while(sum<beverage[2])
					{
						System.out.println("ȯŸ -> 500��");
						System.out.println("���� �ݾ� : " + sum);
						System.out.println("���� �� �־��ּ���!");
						price = scanner.nextInt();
						sum+=price;
						if(sum>=beverage[2]) break;
					}
						sum-=beverage[2];
						System.out.println("�ش� ��ǰ�� ���ſϷ� �Ǿ����ϴ�.");
						System.out.println("�ܾ��� " + sum + "�Դϴ�");
						break;
				default:
					break;
			}
			if(again==true)
			{
				System.out.println("���Ḧ �߰��� �����Ͻðڽ��ϱ�? -> Y(1), N(0)");
				buy=scanner.nextInt();
		
				if(buy==0)
				{
					System.out.println(sum + " ���� ���� ��ȯ�˴ϴ�.");
					System.out.println("���Ǳ⸦ �����մϴ�.");
					again=false;
				}
			}
		} while(again);
		
		scanner.close();
	}
}