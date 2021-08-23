package interface_ex;

interface Test{
	//public int a;
	public static final int a= 12345;
	public final int a1 = 12335;
	public static int a2 = 12345;
	public static String id = "홍길동";
	public static String pwd = "12345";
	//공통적으로 쓸 수 있음
}

public class Ex03 implements Test{
	public static void main(String[] args) {
		System.out.println(Test.id);
		System.out.println(pwd);
	}

}
