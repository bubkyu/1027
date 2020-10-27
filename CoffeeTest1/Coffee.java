package CoffeeTest1;
import java.util.Scanner;
public class Coffee {

	public static void main(String[] args) {
		
		System.out.println("메가커피에 오신것을 환영합니다.");
		
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("		커피            					스무디       					사이드  ");
		System.out.println("1.아메리카노			3,000원 		  	4.요거트 스무디	3,500원			6.치즈케익		4,000원");
		System.out.println("2.카페모카			3,500원			5.딸기   스무디	4,000원			7.초코케익		4,000원");
		System.out.println("3.카라멜마키야또 			4,000원");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		
		int choice = -1;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴를 고르세요.(1~7)");
		choice = scan.nextInt();
		
		System.out.println("선택할 메뉴 : " + choice);
		System.out.println();
		
	}
	{
		
		
	}

}
