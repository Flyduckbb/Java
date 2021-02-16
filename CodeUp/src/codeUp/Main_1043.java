package codeUp;

import java.util.Scanner;

public class Main_1043 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long num1 = sc.nextLong();
		long num2 = sc.nextLong();
		
		System.out.print(num1%num2);
		sc.close();
	}

}
