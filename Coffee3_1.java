import java.util.Scanner;

public class Coffee3_1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int menu; 				// �޴� �Լ�
		String select = null; 	// �޴� ����
		int pay = 0; 			// �ݾװ� '��' ���̾� ���� Ÿ�� ã�ƺ���
		String con; 			// ��Ƽ�� �Է� �޴� ��
		int sum = 0;			// ���հ�
		String menu1= "";		//�� �޴�

		System.out.println("��īĿ�ǿ� ���Ű���  ȯ���մϴ�.");
		while(true) { // ���Ϲ� ����
			System.out.println("�޴��� ������.(1~7) ");
			System.out.println(
					"-----------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("		Ŀ��            					������       					���̵�  ");
			System.out.println("1.�Ƹ޸�ī��			3,000�� 		  	4.���Ʈ ������	3,500��			6.ġ������		4,000��");
			System.out.println("2.ī���ī			3,500��			5.����   ������	4,000��			7.��������		4,000��");
			System.out.println("3.ī��ḶŰ�߶� 			4,000��");
			System.out.println(
					"-----------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println();
			menu = scan.nextInt();

			if (menu == 1) {
				select = "�Ƹ޸�ī��";
				pay = 3000;
				System.out.println("�Ƹ޸�ī�� 3,000�� �����Ͽ����ϴ�.");
			}
			else if(menu == 2) {
				select = " ī���ī";
				pay = 3500;
				System.out.println("ī���ī 3,500�� �����Ͽ����ϴ�.");
			}
			else if(menu == 3) {
				select = "ī��ḶŰ�߶�";
				pay = 4000;
				System.out.println("ī��ḶŰ�߶� 4,000�� �����Ͽ����ϴ�.");
			}
			else if(menu == 4) {
				select = "���Ʈ ������";
				pay = 3500;
				System.out.println("���Ʈ ������ 3,500�� �����Ͽ����ϴ�.");
			}
			else if(menu == 5) {
				select = "���� ������";
				pay = 4000;
				System.out.println("���� ������ 4,000�� �����Ͽ����ϴ�.");
			}
			else if(menu == 6) {
				select = "ġ�� ����";
				pay = 4000;
				System.out.println("ġ������ 4,000�� �����Ͽ����ϴ�.");
			}
			else if(menu == 7) {
				select = "��������";
				pay = 4000;
				System.out.println("�������� 4,000�� �����Ͽ����ϴ�.");
			}else{
				System.out.println("�߸��Է��Ͽ����ϴ�. 1~7 �Է����ּ���.");
			}
			sum = sum + pay;
			menu1 = menu1 + select;
			//����Ʈ ���� ���� ���ϰ� ����..... c = select+3;
			//for ( int i = 1; i < .length; i+3) {
			//	 {
			//		point++;
			//		System.out.print(i + " ");
			//	}
			System.out.println("�߰� �����Ͻðڽ��ϱ�? (y or n)");
			con=scan.next();
			if(con.equals("y")) {
				continue;

			}else if(con.equals("n")){
				break;
			}else
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}  			// ���Ϲ� ����
		System.out.println("���Բ��� �ֹ��Ͻ� �޴��� " + menu1 +"  "+ "�̰� "+ " �� ������ "  + "  "+ sum + " �Դϴ�.");
		System.out.println();

		System.out.println("�����Ͻó���? ( y or n)");
		con=scan.next();
		if(con.equals("y")) {
			System.out.println(" -------------------------------");
			System.out.println("id : hanna");
			System.out.println("pass : 1234");
			System.out.println(" -------------------------------");
			System.out.println("���� ����Ʈ�� 3�� �ֽ��ϴ�.");
			System.out.println("�Ϸ�Ǿ����ϴ�. �����մϴ�.");
		}else {
			System.out.println("�Ϸ�Ǿ����ϴ�. �����մϴ�.");
		}

	}

}