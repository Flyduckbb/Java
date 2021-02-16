package codeUp;

import java.util.Scanner;

public class Main_1041 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char word = sc.nextLine().charAt(0);
		
		System.out.print((char)(word +1));
		sc.close();
	}
}
