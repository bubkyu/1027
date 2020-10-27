
package CoffeeTest;
import java.util.Scanner;
public class Order {
	Scanner scan = new Scanner(System.in);

	int sum = 0; 			// 총합계
	int munu;				// 메뉴선택
	int choiceMenu;			//메뉴 카테고리
	int choiceFood;			//메뉴선택
	int coffeeMenu;			//커피메뉴
	int smoothieMenu;		//스무디
	int cakeMenu;			//케이크

	public void run() {
		welcome();
	}

	public void welcome() {		//환영 메세지와 메뉴판
		System.out.println("메가커피에 오신것을 환영합니다.");
		System.out.println("메뉴를 고르세요.(1~7)");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("		커피            					스무디       					사이드  ");
		System.out.println("1.아메리카노			3,000원 		  	4.요거트 스무디	3,500원			6.치즈케익		4,000원");
		System.out.println("2.카페모카			3,500원			5.딸기   스무디	4,000원			7.초코케익		4,000원");
		System.out.println("3.카라멜마키야또 			4,000원");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------");
	}

	public void choice_menu() {
		choiceMenu = scan.nextInt();
		if(choiceMenu == 1) choice_coffee();
		else if(choiceMenu == 2) choice_smoothie();
		else if(choiceMenu == 3) choice_dessert();
	}


}
