package sec02_interface.EX01_InterfaceCharacteristics;

/*�������̽��� �ʵ� �� �޼����� ������*/

interface A {
	public static final int a = 3;
	public abstract void abc();
}
interface B {
	int b = 3; //������ �ڵ����� public static final
	void bcd();//������ �ڵ����� public abstract
}
public class InterfaceCharacteristics {
	public static void main(String[] args) {		
		//#1. static �ڵ��߰� üũ
		System.out.println(A.a);
		System.out.println(B.b);
		
		//#2. final �ڵ��߰� üũ
		//A.a = 5; //�Ұ���
		//B.b = 5; //�Ұ���
	}
}
