package codeUp;

import java.util.Scanner;

public class Main_1075 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		while(true)
		{
			num--;
			System.out.println(num);
			if(num==0)
				break;
		}
		sc.close();
	}

}
