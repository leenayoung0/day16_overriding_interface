package interface_ex;

import java.util.Scanner;

class B���� implements A����{

	public void �Ѿ˱���() {
		System.out.println("�Ѿ��� ���� �մϴ�");
	}
	@Override
	public void attack() {
		�Ѿ˱���();
		System.out.println("������ ���� �մϴ�");
	}

	public void ��������() {
		System.out.println("���и� ��� �մϴ�");
	}
	@Override
	public void defense() {
		��������();
		System.out.println("������ ��� �մϴ�");
		
	}

	@Override
	public void test() {
		
	} //interface�� implements�� ��� �޴´�
	
}
class B���� implements A����{

	@Override
	public void attack() {

	}

	@Override
	public void defense() {

	}

	@Override
	public void test() {
	
	}
	System.out.println("������ ��� �մϴ�");
	
}

public class Ex02 {
	public static void main(String[] args) {
//		B���� ���� = new B����();
//		B���� ���� = new B����();
		A���� ���� = null; //1.�θ����¸� �ϳ� �����
		System.out.println("���� ó��� �Խ��ϴ�");
		System.out.println("1.���� 2.����");
		
		//upcasting
		int choice = 0;
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num == 1) {
			System.out.println("���� ����");
			���� = new B����();
		}
		else {
			System.out.println("���� ����");
			���� = new B����();
		}
		
		System.out.println("1.���� 2.���");
		choice = input.nextInt();
		if(choice == 1) ����.attack();
		else ����.defense();
//		
//		if(choice == 1 && num == 1) ����.attack();
//		else if(choice ==2 && num == 1) ����.defense();
//		if(choice == 1 && num == 2) ����.attack();
//		else if(choice ==2 && num == 2) ����.defense();
//		
	}

}
