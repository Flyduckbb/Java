package javaExample;

import java.util.Scanner;

public class Num1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.print("두 정수를 입력하세요>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.print(a + "+" + b + "은 " + (a+b));
	}

}
