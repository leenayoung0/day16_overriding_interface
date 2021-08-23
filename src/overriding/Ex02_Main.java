package overriding;

import java.util.ArrayList;

class AA extends ArrayList{
	public void aa() {
		System.out.println("나만의 기능입니다");
	}
	public Object get(int i) {
		return "내가 만든 get이다";
	}
	
}

final class BB{
	public void bb() {
		System.out.println("bb의 기능입니다");
	}
}

class CC {//extends BB{
	BB b = new BB();
	public void bb() {
		b.bb();
		System.out.println("cc의 기능입니다");
		
	}
}

public class Ex02_Main {
	public static void main(String[] args) {
		AA a = new AA();
		//ArrayList arr = new ArrayList(); // ArrayList는 상속을 받을 수 있는 클래스 (final이 안붙어 있음)
		//String s; //(final이 붙어 있음) 상속을 못하게 막아둔것
		// 상속을 안시켜주면 오버라이딩을 쓸 수 없음
		a.add("안녕하세요");
		System.out.println("저장값 : "+ a.get(0));
		String s;
	}

}
