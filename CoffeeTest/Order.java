
package CoffeeTest;
import java.util.Scanner;
public class Order {
	Scanner scan = new Scanner(System.in);

	int sum = 0; 			// ���հ�
	int munu;				// �޴�����
	int choiceMenu;			//�޴� ī�װ�
	int choiceFood;			//�޴�����
	int coffeeMenu;			//Ŀ�Ǹ޴�
	int smoothieMenu;		//������
	int cakeMenu;			//����ũ

	public void run() {
		welcome();
	}

	public void welcome() {		//ȯ�� �޼����� �޴���
		System.out.println("�ް�Ŀ�ǿ� ���Ű��� ȯ���մϴ�.");
		System.out.println("�޴��� ������.(1~7)");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("		Ŀ��            					������       					���̵�  ");
		System.out.println("1.�Ƹ޸�ī��			3,000�� 		  	4.���Ʈ ������	3,500��			6.ġ������		4,000��");
		System.out.println("2.ī���ī			3,500��			5.����   ������	4,000��			7.��������		4,000��");
		System.out.println("3.ī��ḶŰ�߶� 			4,000��");
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
