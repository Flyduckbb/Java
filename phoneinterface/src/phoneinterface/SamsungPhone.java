package phoneinterface;

class SamsungPhone implements Phoneinterface {
	public void sendCall() {
		System.out.println("�츮��������");
	}
	public void receiveCall() {
		System.out.println("��ȭ�� �Խ��ϴ�");
	}
	public void flash() {System.out.println("��ȭ�⿡ ���� �������ϴ�.");}
}
