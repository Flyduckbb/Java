package javaExample;

import java.util.Scanner;

public class Num7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���>>");
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
				System.out.print("�ٽ� �Է��ϼ���.");
		}
	}

}
