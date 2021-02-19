package codeUp;

import java.util.Scanner;

public class Main_1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		
		if(a%2==0)
			System.out.println(a);
		if(b%2==0)
			System.out.println(b);
		if(c%2==0)
			System.out.println(c);
		
		sc.close();
	}

}
