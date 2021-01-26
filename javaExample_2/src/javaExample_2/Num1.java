package javaExample_2;

import java.util.Scanner;

public class Num1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳 한 문자를 입력하세요>>");
		String s = sc.next();
		char c=s.charAt(0);
		
		for(int i='a'; i<=c; i++)
		{
			if(i<=c)
				System.out.print((char)i);
			for(int j=i+1; j<=c;j++)
				System.out.print((char)j);
			System.out.println();
		}
		sc.close();
	}

}
