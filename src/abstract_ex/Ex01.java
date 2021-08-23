package abstract_ex;

abstract class Abstract{
	protected int num;
	public void setNUm(int num) {// 실체화가 되어 있는거
		this.num= num;
	}
	public abstract void combo() ; // 추상화 :실체화가 없는
}
class NewAbstract extends Abstract{
	public void combo() {
		System.out.println(num+" 단 콤보 공격 & 2대 더 때리기");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Abstract a = new NewAbstract();
		a.setNUm(3);
		a.combo();
	}

}
