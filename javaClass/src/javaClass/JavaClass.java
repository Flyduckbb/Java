package javaClass;

public class JavaClass {
	int radius;
	String name;
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		JavaClass pizza;
		pizza=new JavaClass();
		pizza.radius=10;
		pizza.name="�ڹ�����";
		double area=pizza.getArea();
		System.out.println(pizza.name + "�� ������ " + area);
		
		JavaClass donut = new JavaClass();
		donut.radius=2;
		donut.name="�ڹٵ���";
		area=donut.getArea();
		System.out.println(donut.name + "�� ������ " + area);
		
	}

}
