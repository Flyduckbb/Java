package javaExample;

import java.util.Scanner;

public class Num7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학점을 입력하세요>>");
		String grade = sc.next();
		
		switch(grade)
		{
		case"A": case"B":
			System.out.print("Excellent");
			break;
			
		case"C": case"D":
			System.out.print("Good");
			break;
		case"F":
			System.out.print("Bye");
			break;
			default:
				System.out.print("다시 입력하세요.");
		}
	}

}
