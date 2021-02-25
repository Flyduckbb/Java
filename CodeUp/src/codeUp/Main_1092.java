package codeUp;

import java.util.Scanner;

public class Main_1092 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int stu = sc.nextInt();
		int pro = sc.nextInt();
		int master = sc.nextInt();
		
		int day = 1;
		while(day%stu!=0 || day%pro!=0 || day%master!=0)
			day++;
		
		System.out.print(day);
		sc.close();
		
	}

}
