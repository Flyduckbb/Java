package codeUp;

import java.util.Scanner;

public class Main_1027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String ymd = sc.next();
		String[] YMD = ymd.split("\\.");
		
		int year = Integer.valueOf(YMD[0]);
		int month = Integer.valueOf(YMD[1]);
		int day = Integer.valueOf(YMD[2]);
		
		System.out.printf("%02d-%02d-%04d", day, month, year);
		
		sc.close();
	}

}
