import java.util.Scanner;

public class Coffee3_1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int menu; 				// 메뉴 함수
		String select = null; 	// 메뉴 선택
		int pay = 0; 			// 금액과 '원' 같이쓸 변수 타입 찾아보기
		String con; 			// 컨티뉴 입력 받는 값
		int sum = 0;			// 총합계
		String menu1= "";		//총 메뉴

		System.out.println("메카커피에 오신것을  환영합니다.");
		while(true) { // 와일문 시작
			System.out.println("메뉴를 고르세요.(1~7) ");
			System.out.println(
					"-----------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("		커피            					스무디       					사이드  ");
			System.out.println("1.아메리카노			3,000원 		  	4.요거트 스무디	3,500원			6.치즈케익		4,000원");
			System.out.println("2.카페모카			3,500원			5.딸기   스무디	4,000원			7.초코케익		4,000원");
			System.out.println("3.카라멜마키야또 			4,000원");
			System.out.println(
					"-----------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println();
			menu = scan.nextInt();

			if (menu == 1) {
				select = "아메리카노";
				pay = 3000;
				System.out.println("아메리카노 3,000원 선택하였습니다.");
			}
			else if(menu == 2) {
				select = " 카페모카";
				pay = 3500;
				System.out.println("카페모카 3,500원 선택하였습니다.");
			}
			else if(menu == 3) {
				select = "카라멜마키야또";
				pay = 4000;
				System.out.println("카라멜마키야또 4,000원 선택하였습니다.");
			}
			else if(menu == 4) {
				select = "요거트 스무디";
				pay = 3500;
				System.out.println("요거트 스무디 3,500원 선택하였습니다.");
			}
			else if(menu == 5) {
				select = "딸기 스무디";
				pay = 4000;
				System.out.println("딸기 스무디 4,000원 선택하였습니다.");
			}
			else if(menu == 6) {
				select = "치즈 케익";
				pay = 4000;
				System.out.println("치즈케익 4,000원 선택하였습니다.");
			}
			else if(menu == 7) {
				select = "초코케익";
				pay = 4000;
				System.out.println("초코케익 4,000원 선택하였습니다.");
			}else{
				System.out.println("잘못입력하였습니다. 1~7 입력해주세요.");
			}
			sum = sum + pay;
			menu1 = menu1 + select;
			//포인트 증가 값을 구하고 싶음..... c = select+3;
			//for ( int i = 1; i < .length; i+3) {
			//	 {
			//		point++;
			//		System.out.print(i + " ");
			//	}
			System.out.println("추가 선택하시겠습니까? (y or n)");
			con=scan.next();
			if(con.equals("y")) {
				continue;

			}else if(con.equals("n")){
				break;
			}else
				System.out.println("잘못 입력하셨습니다.");
		}  			// 와일문 종료
		System.out.println("고객님꼐서 주문하신 메뉴는 " + menu1 +"  "+ "이고 "+ " 총 가격은 "  + "  "+ sum + " 입니다.");
		System.out.println();

		System.out.println("적립하시나요? ( y or n)");
		con=scan.next();
		if(con.equals("y")) {
			System.out.println(" -------------------------------");
			System.out.println("id : hanna");
			System.out.println("pass : 1234");
			System.out.println(" -------------------------------");
			System.out.println("현재 포인트는 3장 있습니다.");
			System.out.println("완료되었습니다. 감사합니다.");
		}else {
			System.out.println("완료되었습니다. 감사합니다.");
		}

	}

}