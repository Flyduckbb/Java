package codeUp;

import java.util.Scanner;

public class Main_1085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long h = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		long s = sc.nextInt();
		
		double sum = h*b*c*s;
		
		double result = (sum/8)/Math.pow(2, 10)/Math.pow(2, 10);
		System.out.format("%.1f MB", result);
		sc.close();
	}

}
