package javaExample_2;

import java.util.Scanner;

public class Num6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String eng[] = {"student", "love", "java", "happy", "future"};
		String kor[] = {"학생", "사랑", "자바", "행복", "미래"};
		
		while(true)
		{
			System.out.print("영어 단어를 입력하세요>>");
			String e = sc.next();
			
			if(e.equals("exit"))
			{
				System.out.print("종료합니다....");
				sc.close();
				break;
			}
			
			for(int i=0; i<eng.length; i++)
			{
				if(e.equals(eng[i]))
				{
					System.out.println(kor[i]);
					break;
				}
				else if(!e.equals(eng[i]) && i==4)
				{
					System.out.println("그런 영어 단어가 없습니다.");
					break;
				}
			}

		}
	}
}
