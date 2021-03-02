package codeUp;

import java.util.Scanner;

public class Main_1095 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		int min = 24;
		
		for(int i=0; i<cnt; i++)
		{
			int num = sc.nextInt();
			if(min>num)
				min=num;
		}
		
		System.out.print(min);
		sc.close();
		
	}

}
