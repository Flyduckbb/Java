package codeUp;

import java.util.Scanner;

public class Main_1080 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum=0;
		
		for(int i=0; i<num; i++)
		{
			sum+=i;
			if(sum>=num)
			{
				System.out.print(i);
				break;
			}
		}

		sc.close();
	}

}
