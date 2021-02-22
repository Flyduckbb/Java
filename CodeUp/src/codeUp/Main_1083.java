package codeUp;

import java.util.Scanner;

public class Main_1083 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		
		for(int i=1; i<=cnt; i++)
		{
			if(i%3==0)
			{
				System.out.print("X ");
				continue;
			}
			
			System.out.print(i+" ");
		}
		sc.close();
	}

}
