package codeUp;

import java.util.Scanner;

public class Main_1055 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int bool = 0;
		if(num1+num2>0) bool = 1;
		
		System.out.print(bool);
		sc.close();
	}

}
