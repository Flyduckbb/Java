package codeUp;

import java.util.Scanner;

public class Main_1074 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		while(true)
		{
			if(num==0)
				break;
			
			System.out.println(num);
			num--;
		}
		sc.close();
	}

}
