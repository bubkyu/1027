import java.util.*;

public class CafeMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int take;
		int sum =0;
		int menu ,coffeeMenu, smoothieMenu, cakeMenu;
		String con;

		String[] homemenu = {"[1] 커피", "[2] 스무디", "[3] 케이크"};

		String[] coffee = {"[1] 아이스 아메리카노", "[2] 핫 아메리카노", "[3] 카페 모카", "[4] 카라멜 마끼아또"};
		int[] coffeePay = {2000,1500,2700,3500};
		
		String[] smoothie = {"[1] 요거트 스무디", "[2] 딸기 스무디"};
		int[] smoothiePay = {3900, 3900};
		
		String[] cake = {"[1] 치즈 케이크", "[2] 초코 케이크"};
		int[] cakePay = {4500,5000};

		System.out.println("-----------------------");
		System.out.println("------MEGA COFFEE------");
		System.out.println("-----------------------");

		System.out.println("[1] 매장 안\t"+"[2]테이크아웃");
		take = scan.nextInt();
		String take1;
				
		for(;;) {
		
			if(take == 1) {
				take1 = "매장 안";
			}else {
				take1 = "테이크 아웃";
			} // if-else문 끝
			System.out.println( take1 +"으로 설정되었습니다.");
			System.out.println();
			for (int i = 0; i < homemenu.length; i++) {
				System.out.print(homemenu[i]);
			}//for
			System.out.println();
			menu = scan.nextInt();

			if(menu == 1) {
				for (int j = 0; j < coffee.length; j++) {
					System.out.print(coffee[j]);
					System.out.println(coffeePay[j]);
							
				}//커피 종류들

				coffeeMenu = scan.nextInt();
				for (int i = 0; i < coffee.length; i++) {
					if(coffeeMenu-1 ==i) {
						System.out.println(coffee[i]+coffeePay[i]+"이 선택 되었습니다.");
						sum += coffeePay[i];
						break;
					}
				}
			}//if menu==1


			if(menu == 2) {
				for (int j = 0; j < smoothie.length; j++) {
					System.out.print(smoothie[j]);
					System.out.println(smoothiePay[j]);
				}

				smoothieMenu = scan.nextInt();
				for (int i = 0; i < smoothie.length; i++) {
					if(smoothieMenu-1 ==i) {
						System.out.println(smoothie[i]+smoothiePay[i]+"이 선택 되었습니다.");
						sum += smoothiePay[i];
						break;
					}
				}


			}//if menu==2

			if(menu == 3) {
				for (int j = 0; j < cake.length; j++) {
					System.out.print(cake[j]);
					System.out.println(cakePay[j]);
				}

				cakeMenu = scan.nextInt();
				for (int i = 0; i < cake.length; i++) {
					if(cakeMenu-1 ==i) {
						System.out.println(cake[i]+cakePay[i]+"이 선택 되었습니다.");
						sum += cakePay[i];
						break;
					}
				}
			}//if menu==3


			System.out.println("추가로 선택하시겠습니까? (y or n)");
			con = scan.next();
			if(con.equals("y")) {
				continue;
			}else {
				break;
			}

		}//for(;;) 끝

		System.out.println(""+sum);

	}

}
