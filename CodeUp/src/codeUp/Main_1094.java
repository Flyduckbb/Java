package codeUp;

import java.util.Scanner;

public class Main_1094 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		int ary[] = new int[cnt];
		
		for(int i=0; i<cnt; i++)
		{
			int num = sc.nextInt();
			ary[cnt-i-1] = num;
		}
		
		for(int i=0; i<cnt; i++)
			System.out.print(ary[i]+" ");
		
		sc.close();
	}

}
