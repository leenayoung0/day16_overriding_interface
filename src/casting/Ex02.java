package casting;

class Parents {
	public void familyName() {
		System.out.print("이 ");
	}
	public void name() {
		familyName();
		System.out.println("순신");
	}
}
class Daughter extends Parents{
	public void name() {
		familyName();
		System.out.println("국주");
	}
}
class Son extends Parents{
	public void name() {
		familyName();
		System.out.println("기광");
	}
}

public class Ex02 {
	public static void main(String[] args) {
//		Parents p = new Parents();
//		p.name();
//		Daughter d = new Daughter();
//		d.name();
//		Son s = new Son();
//		s.name();
		
		//upcasting 용어만 안썼을뿐, 우린 계속 사용해왔음
		Parents p = new Parents();
		p.name();
		p = new Daughter();
		p.name();
		p = new Son();
		p.name();
	}

}
