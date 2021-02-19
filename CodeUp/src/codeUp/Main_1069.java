package codeUp;

import java.util.Scanner;

public class Main_1069 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char alph = sc.nextLine().charAt(0);
		
		switch(alph)
		{
			case 'A':
				System.out.print("best!!!");
				break;
			
			case 'B':
				System.out.print("good!!");;
				break;
				
			case 'C':
				System.out.print("run!");
				break;
				
			case 'D':
				System.out.print("slowly~");
				break;
				
			default:
				System.out.print("what?");

		}
		
		sc.close();
	}

}
