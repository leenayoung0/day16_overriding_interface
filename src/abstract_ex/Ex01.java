package abstract_ex;

abstract class Abstract{
	protected int num;
	public void setNUm(int num) {// ��üȭ�� �Ǿ� �ִ°�
		this.num= num;
	}
	public abstract void combo() ; // �߻�ȭ :��üȭ�� ����
}
class NewAbstract extends Abstract{
	public void combo() {
		System.out.println(num+" �� �޺� ���� & 2�� �� ������");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Abstract a = new NewAbstract();
		a.setNUm(3);
		a.combo();
	}

}
