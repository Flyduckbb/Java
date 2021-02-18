package codeUp;

import java.util.Scanner;

public class Main_1060 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long num1 = sc.nextInt();
		long num2 = sc.nextInt();
		
		System.out.printf("%d", num1&num2);
		sc.close();
	}

}
