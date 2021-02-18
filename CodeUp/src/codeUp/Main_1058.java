package codeUp;

import java.util.Scanner;

public class Main_1058 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int result=1;
		
		if(num1+num2>=1) result=0;
		
		System.out.print(result);
		sc.close();
	}

}
