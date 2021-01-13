package javaExample;

import java.util.Scanner;

public class Num3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x, y = 0;

		System.out.print("x 값을 입력하세요 >>");
		x = sc.nextInt();
		
		y=(x*x)-(3*x)+7;
		
		System.out.print("x="+x+", y="+y);
	}

}
