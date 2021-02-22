package codeUp;

import java.util.Scanner;

public class Main_1078 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		int sum = 0;
		
		for(int i=0; i<=cnt; i++)
		{
			if(i%2==0)
				sum+=i;
		}
		
		System.out.print(sum);
		sc.close();
	}

}
