package codeUp;

import java.util.Scanner;

public class Main_1052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long num1 = sc.nextInt();
		long num2 = sc.nextInt();
		
		int bool = (num1!=num2) ? 1 : 0;
		
		System.out.print(bool);
		sc.close();
	}

}
