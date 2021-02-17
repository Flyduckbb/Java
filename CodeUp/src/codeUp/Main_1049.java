package codeUp;

import java.util.Scanner;

public class Main_1049 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long num1 = sc.nextInt();
		long num2 = sc.nextInt();
		
		int bool=0;
		
		if(num1>num2) bool=1;
		
		System.out.print(bool);
		sc.close();
	}

}
