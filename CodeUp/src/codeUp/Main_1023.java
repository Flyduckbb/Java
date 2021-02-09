package codeUp;

import java.util.Scanner;

public class Main_1023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num = sc.next();
		
		String[] detach = num.split("\\.");
		
		int integer = Integer.valueOf(detach[0]);
		int decimal = Integer.valueOf(detach[1]);
		
		System.out.println(integer);
		System.out.printf("%d",decimal);
		
		sc.close();
	}

}
