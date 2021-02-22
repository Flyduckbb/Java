package codeUp;

import java.util.Scanner;

public class Main_1079 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			char word = sc.next().charAt(0);
			
			if(word=='q')
			{
				System.out.println(word);
				break;
			}
			
			System.out.println(word);
		}
		sc.close();
	}

}
