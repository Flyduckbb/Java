package codeUp;

import java.util.Scanner;

public class Main_1082 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String o_num = sc.nextLine();
		
		int num = Integer.valueOf(o_num, 16);
		
		for(int i=1; i<16; i++)
		{
			System.out.printf("%X*%X=%X\n", num,i,(num*i));
		}
		
		sc.close();
	}

}
