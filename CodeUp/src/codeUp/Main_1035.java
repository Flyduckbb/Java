package codeUp;

import java.util.Scanner;

public class Main_1035 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		
		int x = Integer.valueOf(num, 16);
		
		System.out.printf("%o", x);
		
		sc.close();
	}

}
