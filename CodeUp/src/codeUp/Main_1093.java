package codeUp;

import java.util.Scanner;

public class Main_1093 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		int ary[] = new int[23];
		
		for(int i=0; i<cnt; i++)
		{
			int num = sc.nextInt();
			ary[num-1]+=1;
		}
		
		for(int i=0; i<23; i++)
			System.out.print(ary[i] + " ");
		
		sc.close();
	}

}
