package codeUp;

import java.util.Scanner;

public class Main_1067 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long num = sc.nextInt();
		
		if(num>0)
		{
			System.out.println("plus");
			if(num%2==0)
				System.out.println("even");
			else
				System.out.println("odd");
		}
		else
		{
			System.out.println("minus");
			if(num%2==0)
				System.out.println("even");
			else
				System.out.println("odd");
		}
		
		sc.close();
	}

}
