package javaExample;

import java.util.Scanner;

public class Num5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("논리 연산을 입력하세요>>");
		boolean a = sc.nextBoolean();
		String op = sc.next();
		boolean b = sc.nextBoolean();
		
		switch(op)
		{
		case "AND":
			System.out.print(a&b);
		case "OR":
			System.out.print(a|b);
			break;
		}
	}

}
