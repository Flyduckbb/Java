package codeUp;

import java.util.Scanner;

public class Main_1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String y_m_d = sc.next();
		String[] ymd = y_m_d.split("\\.");
		
		int year = Integer.valueOf(ymd[0]);
		int month = Integer.valueOf(ymd[1]);
		int day = Integer.valueOf(ymd[2]);
		
		System.out.printf("%04d.%02d.%02d", year, month, day);
		
		sc.close();
	}

}
