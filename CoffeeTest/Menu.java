package CoffeeTest;
import java.util.Scanner;

public class Menu {
	Scanner scan = new Scanner(System.in);

	public String[] menuCoffee;	//커피 메뉴
	public int [] priceCoffee;	//커피 가격

	public String [] menuS;		//스무디 메뉴
	public int [] priceS;		//스무디 가격

	public String [] menuCake;	//케이크 메뉴
	public int [] priceCake;//케이크 가격

	public String[] menu = new String[50];	// 주문받을 메뉴 누적
	public int[] price = new int[50];		//주문받은 가격 누적

	int sum=0;					//총 결제 금액
	int count = 0;				// 주문, 결제금액 누적



	public Menu() {				//메뉴 
		menuCoffee = new String [] { "아메리카노", "카페모카", "카라멜마키야또"};
		priceCoffee = new int [] { 3000, 3500, 4000};

		menuS = new String [] {"요거트 스무디" , "딸기 스무디"};
		priceS = new int [] { 3500, 4000};

		menuCake = new String[] {"치즈케익" , "초코케익"};
		priceCake = new int [] {4000, 4000};	

	}

	public void coffee(String menu, int price) {
		this.menu[count] = menu;
		this.price[count] = price;

		print();		
	}
	public void smoothie(String menu, int price) {
		this.menu[count] = menu;
		this.price[count] = price;

		print();
	}
	public void dessert(String menu, int price) {
		this.menu[count] = menu;
		this.price[count] = price;
		
		print();
	}
	
	public void print() {		//
		System.out.println((this.menu[count-1]) + (this.price[count-1])+ "원을 추가");
		count++;
	}
	public String getMenu() {	//주문 메뉴 출력
		return menu[count];
	}
	public int getPrice() {		//주문 가격 출력
		return price[count];
	}
	public int sum() {		//총합계
		sum = 0;
		for(int i = 0; i <=count; i++) {
			sum = sum + price[i];
		}
		return sum;
	}
	
}
