package codeUp;

import java.util.Scanner;

public class Main_1025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num = sc.next();
		String[] num_s = num.split("");
		
		for(int i=0; i<num_s.length; i++)
		{
			int num_i = Integer.valueOf(num_s[i]);
			double power = Math.pow(10.0, i);
			num_i = num_i * (10000/(int)power);
			System.out.println("[" + num_i+ "]");
		}
		sc.close();
		
	}
}
