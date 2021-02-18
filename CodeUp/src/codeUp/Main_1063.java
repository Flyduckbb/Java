package codeUp;

import java.util.Scanner;

public class Main_1063 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long num1 = sc.nextInt();
		long num2 = sc.nextInt();
		
		long result = (num1 > num2) ? num1 : num2;
		System.out.print(result);
		sc.close();
	}

}
