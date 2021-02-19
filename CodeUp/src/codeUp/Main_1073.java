package codeUp;

import java.util.Scanner;

public class Main_1073 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean trig = true;
		while(trig)
		{
			long num = sc.nextInt();
			if(num==0)
				break;
			System.out.println(num);
		}
		sc.close();
	}

}
