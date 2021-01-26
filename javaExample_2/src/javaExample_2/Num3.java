package javaExample_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Num3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				

			try {
				System.out.print("정수를 입력하세요>>");
				int num = sc.nextInt();
				if(num%2==0)
					System.out.print("짝수\n");
				else
					System.out.print("홀수\n");
			}
			catch(InputMismatchException e) {
				System.out.print("수를 입력하지 않아 프로그램 종료합니다");
			}
			finally {
				sc.close();
			}
	}

}
