package codeUp;

import java.util.Scanner;

public class Main_1026 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String time = sc.next();
		
		String[] ttime = time.split(":");
		
		int min = Integer.valueOf(ttime[1]);
		
		System.out.printf("%d", min);
		
		sc.close();
	}

}
