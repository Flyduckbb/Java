package javaExample_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Num3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				

			try {
				System.out.print("������ �Է��ϼ���>>");
				int num = sc.nextInt();
				if(num%2==0)
					System.out.print("¦��\n");
				else
					System.out.print("Ȧ��\n");
			}
			catch(InputMismatchException e) {
				System.out.print("���� �Է����� �ʾ� ���α׷� �����մϴ�");
			}
			finally {
				sc.close();
			}
	}

}
