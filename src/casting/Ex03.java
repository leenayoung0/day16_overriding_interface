package casting;

import java.util.ArrayList;

class AAA{
	public String getText() {return "AAA클래스";}
}

public class Ex03 {
	public static void main(String[] args) {
		// 이것도 일종의 upcasting
//		ArrayList arr = new ArrayList();
//		arr.add(1234);
//		arr.add("aaa");
//		arr.add(111);
		
		//AAA a = new AAA();
		//a.
		Object a = new AAA();
		//a.
		// 자신의 형태로 받으면 자기자신껄 쓸 수 있음
		//부모껄로 받으면 자신껄 쓸 수 없음
		
		//downcasting : 부모형태로 받아서 다시 자식형태로
		AAA aa = (AAA)a;
		aa.getText();
		
		ArrayList arr = new ArrayList();
		arr.add("test");
		//arr.ge
		String s = (String) arr.get(0);
		
		
		
	
	}

}
