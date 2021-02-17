package codeUp;

import java.util.Scanner;

public class Main_1048 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int integer = sc.nextInt();
		int exponent = sc.nextInt();
		
		System.out.printf("%d", integer<<exponent);
		
		sc.close();
	}

}
