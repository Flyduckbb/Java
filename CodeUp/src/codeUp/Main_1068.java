package codeUp;

import java.util.Scanner;

public class Main_1068 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int grade = sc.nextInt();
		
		if(grade>=90)
			System.out.print("A");
		else if(grade>=70)
			System.out.print("B");
		else if(grade>=40)
			System.out.print("C");
		else
			System.out.print("D");
		
		sc.close();
	}

}
