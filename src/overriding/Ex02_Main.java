package overriding;

import java.util.ArrayList;

class AA extends ArrayList{
	public void aa() {
		System.out.println("������ ����Դϴ�");
	}
	public Object get(int i) {
		return "���� ���� get�̴�";
	}
	
}

final class BB{
	public void bb() {
		System.out.println("bb�� ����Դϴ�");
	}
}

class CC {//extends BB{
	BB b = new BB();
	public void bb() {
		b.bb();
		System.out.println("cc�� ����Դϴ�");
		
	}
}

public class Ex02_Main {
	public static void main(String[] args) {
		AA a = new AA();
		//ArrayList arr = new ArrayList(); // ArrayList�� ����� ���� �� �ִ� Ŭ���� (final�� �Ⱥپ� ����)
		//String s; //(final�� �پ� ����) ����� ���ϰ� ���Ƶа�
		// ����� �Ƚ����ָ� �������̵��� �� �� ����
		a.add("�ȳ��ϼ���");
		System.out.println("���尪 : "+ a.get(0));
		String s;
	}

}
