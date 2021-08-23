package interface_ex;

import java.util.Scanner;

class B지상군 implements A공방{

	public void 총알구비() {
		System.out.println("총알을 장전 합니다");
	}
	@Override
	public void attack() {
		총알구비();
		System.out.println("지상군이 공격 합니다");
	}

	public void 방패착용() {
		System.out.println("방패를 사용 합니다");
	}
	@Override
	public void defense() {
		방패착용();
		System.out.println("지상군이 방어 합니다");
		
	}

	@Override
	public void test() {
		
	} //interface는 implements로 상속 받는다
	
}
class B공군 implements A공방{

	@Override
	public void attack() {

	}

	@Override
	public void defense() {

	}

	@Override
	public void test() {
	
	}
	System.out.println("지상군이 방어 합니다");
	
}

public class Ex02 {
	public static void main(String[] args) {
//		B지상군 지상군 = new B지상군();
//		B공군 공군 = new B공군();
		A공방 공방 = null; //1.부모형태를 하나 만들기
		System.out.println("적이 처들어 왔습니다");
		System.out.println("1.지상군 2.공군");
		
		//upcasting
		int choice = 0;
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num == 1) {
			System.out.println("지상군 선택");
			공방 = new B지상군();
		}
		else {
			System.out.println("공군 선택");
			공방 = new B공군();
		}
		
		System.out.println("1.공격 2.방어");
		choice = input.nextInt();
		if(choice == 1) 공방.attack();
		else 공방.defense();
//		
//		if(choice == 1 && num == 1) 지상군.attack();
//		else if(choice ==2 && num == 1) 지상군.defense();
//		if(choice == 1 && num == 2) 공군.attack();
//		else if(choice ==2 && num == 2) 공군.defense();
//		
	}

}
