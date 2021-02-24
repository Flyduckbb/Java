package codeUp;

import java.util.Scanner;

public class Main_1086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int w = sc.nextInt();
		int h = sc.nextInt();
		int b = sc.nextInt();
		double sum = w*h*b;
		
		double result = (sum/8)/Math.pow(2, 10)/Math.pow(2, 10);
		
		System.out.printf("%.2f MB", result);
		sc.close();
	}

}
