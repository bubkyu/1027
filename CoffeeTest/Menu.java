package CoffeeTest;
import java.util.Scanner;

public class Menu {
	Scanner scan = new Scanner(System.in);

	public String[] menuCoffee;	//Ŀ�� �޴�
	public int [] priceCoffee;	//Ŀ�� ����

	public String [] menuS;		//������ �޴�
	public int [] priceS;		//������ ����

	public String [] menuCake;	//����ũ �޴�
	public int [] priceCake;//����ũ ����

	public String[] menu = new String[50];	// �ֹ����� �޴� ����
	public int[] price = new int[50];		//�ֹ����� ���� ����

	int sum=0;					//�� ���� �ݾ�
	int count = 0;				// �ֹ�, �����ݾ� ����



	public Menu() {				//�޴� 
		menuCoffee = new String [] { "�Ƹ޸�ī��", "ī���ī", "ī��ḶŰ�߶�"};
		priceCoffee = new int [] { 3000, 3500, 4000};

		menuS = new String [] {"���Ʈ ������" , "���� ������"};
		priceS = new int [] { 3500, 4000};

		menuCake = new String[] {"ġ������" , "��������"};
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
		System.out.println((this.menu[count-1]) + (this.price[count-1])+ "���� �߰�");
		count++;
	}
	public String getMenu() {	//�ֹ� �޴� ���
		return menu[count];
	}
	public int getPrice() {		//�ֹ� ���� ���
		return price[count];
	}
	public int sum() {		//���հ�
		sum = 0;
		for(int i = 0; i <=count; i++) {
			sum = sum + price[i];
		}
		return sum;
	}
	
}
