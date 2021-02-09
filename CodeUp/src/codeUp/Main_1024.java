package codeUp;

import java.util.Scanner;

public class Main_1024 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		
		String[] detach = word.split("");
		
		for(int i=0; i<detach.length; i++)
			System.out.println("'"+detach[i]+"'");
		
		sc.close();
	}

}
