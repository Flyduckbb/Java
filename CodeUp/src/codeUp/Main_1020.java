package codeUp;

import java.util.Scanner;

public class Main_1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String SocialSecurityNumber = sc.next();
		
		String[] SSC = SocialSecurityNumber.split("-");
		
		int front = Integer.valueOf(SSC[0]);
		int rear = Integer.valueOf(SSC[1]);
		
		System.out.printf("%06d%07d", front,rear);
		
		sc.close();
	}
}
