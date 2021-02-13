package codeUp;

import java.util.Scanner;

public class Main_1034 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		
		int o = Integer.valueOf(num, 8);
		
		System.out.print(o);
		
		sc.close();
	}

}
