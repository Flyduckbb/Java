package codeUp;

import java.util.Scanner;

public class Main_1064 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long num1 = sc.nextInt();
		long num2 = sc.nextInt();
		long num3 = sc.nextInt();
		num1 = (num1 < num2) ? num1 : num2;
		num2 = (num1 < num3) ? num1 : num3;
		
		System.out.print(num2);
		sc.close();
	}

}
