package codeUp;

import java.util.Scanner;

public class Main_1050 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextInt();
		long b = sc.nextInt();
		int bool=0;
		
		if(a==b) bool=1;
		System.out.print(bool);
		sc.close();
	}

}
