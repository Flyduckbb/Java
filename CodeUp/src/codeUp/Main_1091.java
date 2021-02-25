package codeUp;

import java.util.Scanner;

public class Main_1091 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextInt();
		long m = sc.nextInt();
		long d = sc.nextInt();
		long n = sc.nextInt();
		
		for(int i=1; i<n; i++)
		{
			a*=m;
			a+=d;
		}
		
		System.out.print(a);
		sc.close();
	}

}
