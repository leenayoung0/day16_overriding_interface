package interface_ex;

public interface A공방 {
	public void attack(); //abstract 넣어도 안넣어도 상관없지만 인터페이스는 자동적으로 포함하고 있다고 생각
	public void defense();
	
	public void test() {// 실체화가 있으면 에러뜬다. 
		System.out.println("test"); 
	}

}
