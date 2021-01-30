package javaExample_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Num4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char arry[]= {'일','월','화','수','목','금','토'};
	
		while(true)
		try {
			System.out.print("정수를 입력하세요>>");
			int day=sc.nextInt();
			int i=day%7;
			if(day<0)
			{
				System.out.print("프로그램 종료합니다....");
				break;			
			}
			System.out.println(arry[i]);
		}
		catch(InputMismatchException e) {
			System.out.println("경고! 수를 입력하지 않았습니다");
			sc.nextLine();
		}
		
		sc.close();
	}

}
