package codeUp;

import java.util.Scanner;

public class Main_1076 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char word = sc.nextLine().charAt(0);
		
		for(char i = 'a'; i<=word; i++) 
			System.out.print(i+" ");
		
		sc.close();
	}
}