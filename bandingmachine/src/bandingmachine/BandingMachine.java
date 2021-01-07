package bandingmachine;

import java.util.Scanner;

public class BandingMachine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int price, cnt, buy, sum = 0;
		boolean n = true;
		String drink[] = {"콜라", "사이다", "주스"};
		
		do
		{
			System.out.println("돈을 투입해 주십시오");
			price=scanner.nextInt();
			sum+=price;
			System.out.println("투입된 돈 " + sum);
			
			System.out.println("원하는 음료의 번호를 눌러주세요!");
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
					System.out.println("돈을 더 넣어주세요");
					price=scanner.nextInt();
					sum+=price;
					System.out.println("투입된 금액은 " + sum);
				}
				if(sum>=800)
				{
					System.out.println(drink[0] + "제품이  구매되었습니다");
					sum-=700;
					System.out.println("잔돈은 " + sum + " 입니다.");
					break;
				}
			case 2:
				while(sum<700)
				{
					System.out.println("돈을 더 넣어주세요");
					price=scanner.nextInt();
					sum+=price;
					System.out.println("투입된 금액은 " + sum);
				}
				if(sum>=700)
				{
					System.out.println(drink[0] + "제품이  구매되었습니다");
					sum-=700;
					System.out.println("잔돈은 " + sum + " 입니다.");
					break;
				}
			case 3:
				while(sum<900)
				{
					System.out.println("돈을 더 넣어주세요");
					price=scanner.nextInt();
					sum+=price;
					System.out.println("투입된 금액은 " + sum);
				}
				if(sum>=900)
				{
					System.out.println(drink[0] + "제품이  구매되었습니다");
					sum-=700;
					System.out.println("잔돈은 " + sum + " 입니다.");
					break;
				}
			default:
				System.out.println("다시 선택해 주세요");
				break;
			}
			
			if(n==true)
			{
				System.out.println("음료를 추가로 구매하시겠습니까? -> Y(1), N(0)");
				buy=scanner.nextInt();
		
				if(buy==0)
				{
					System.out.println("잔돈을 반환합니다 -> 잔돈 : " + sum);
					System.out.println("자판기를 종료합니다.");
					n=false;
				}
			}
		} while(n);
		
		scanner.close();
	}

}
