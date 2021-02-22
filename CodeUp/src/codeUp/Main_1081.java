package codeUp;

import java.util.Scanner;

public class Main_1081 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dice1 = sc.nextInt();
		int diec2 = sc.nextInt();
		
		for(int i=1; i<=dice1; i++)
		{
			for(int j=1; j<=diec2; j++)
				System.out.println(i + " " + j);
		}
		
		sc.close();
	}

}
