import java.util.*;

public class Coffee6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int take;
		int sum =0;
		int menu ,coffeeMenu, smoothieMenu, cakeMenu;
		String con;
		
		String[] homemenu = {"[1] Ŀ��", "[2] ������", "[3] ����ũ"};

		String[] coffee = {"[1] ���̽� �Ƹ޸�ī��", "[2] �� �Ƹ޸�ī��", "[3] ī�� ��ī", "[4] ī��� �����ƶ�"};
		int[] coffeePay = {2000,1500,2700,3500};
		String[] smoothie = {"[1] ���Ʈ ������", "[2] ���� ������"};
		int[] smoothiePay = {3900, 3900};
		String[] cake = {"[1] ġ�� ����ũ", "[2] ���� ����ũ"};
		int[] cakePay = {4500,5000};

		for(;;) {
			System.out.println("-----------------------");
			System.out.println("------MEGA COFFEE------");
			System.out.println("-----------------------");

			System.out.println("[1] ���� ��\t"+"[2]����ũ�ƿ�");
			take = scan.nextInt();
			String take1;

			if(take == 1) {
				take1 = "���� ��";
			}else {
				take1 = "����ũ �ƿ�";
			} // if-else�� ��
			System.out.println( take1 +"���� �����Ǿ����ϴ�.");

			for (int i = 0; i < homemenu.length; i++) {
				System.out.print(homemenu[i]);
			}//for

			menu = scan.nextInt();

			if(menu == 1) {
				for (int j = 0; j < coffee.length; j++) {
					System.out.print(coffee[j]);
					System.out.println(coffeePay[j]);
				}

				coffeeMenu = scan.nextInt();
				for (int i = 0; i < coffee.length; i++) {
					if(coffeeMenu-1 ==i) {
						System.out.println(coffee[i]+coffeePay[i]+"�� ���� �Ǿ����ϴ�.");
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
						System.out.println(smoothie[i]+smoothiePay[i]+"�� ���� �Ǿ����ϴ�.");
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
						System.out.println(cake[i]+cakePay[i]+"�� ���� �Ǿ����ϴ�.");
						sum += cakePay[i];
						break;
					}
				}
			}//if menu==3


			System.out.println("�߰��� �����Ͻðڽ��ϱ�? (y or n)");
			con = scan.next();
			if(con.equals("y")) {
				continue;
			}else {
				break;
			}

		}//for(;;) ��
		
		System.out.println(""+sum);

	}

}