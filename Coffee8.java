import java.util.Scanner;
class Menu{			// ��� �ʵ�
	int pay = 0;
	String name = "�Ƹ޸�ī��";
	String select;
	
	public void AA() {
		select = "�Ƹ޸�ī��";
		pay = 3000;
		System.out.println("�Ƹ޸�ī�� 3,000�� �����Ͽ����ϴ�.");

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
		System.out.println("�޴���������");
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
