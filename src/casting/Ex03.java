package casting;

import java.util.ArrayList;

class AAA{
	public String getText() {return "AAAŬ����";}
}

public class Ex03 {
	public static void main(String[] args) {
		// �̰͵� ������ upcasting
//		ArrayList arr = new ArrayList();
//		arr.add(1234);
//		arr.add("aaa");
//		arr.add(111);
		
		//AAA a = new AAA();
		//a.
		Object a = new AAA();
		//a.
		// �ڽ��� ���·� ������ �ڱ��ڽŲ� �� �� ����
		//�θ𲬷� ������ �ڽŲ� �� �� ����
		
		//downcasting : �θ����·� �޾Ƽ� �ٽ� �ڽ����·�
		AAA aa = (AAA)a;
		aa.getText();
		
		ArrayList arr = new ArrayList();
		arr.add("test");
		//arr.ge
		String s = (String) arr.get(0);
		
		
		
	
	}

}
