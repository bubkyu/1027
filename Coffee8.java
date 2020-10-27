import java.util.Scanner;
class Menu{			// 멤버 필드
	int pay = 0;
	String name = "아메리카노";
	String select;
	
	public void AA() {
		select = "아메리카노";
		pay = 3000;
		System.out.println("아메리카노 3,000원 선택하였습니다.");

	}


	public void BB() {
		for ( )
	}
}

class real {

	public real() {
		int choice ;
		Scanner scan = new Scanner(System.in);
		Menu menu = new Menu();
		System.out.println("메뉴를고르세요");
		choice =scan.nextInt();	
		if(choice ==1) {

			menu.AA();
		}

	}


}

public class Coffee8 {

	public static void main(String[] args) {
		real r = new real();
	


	}

}
