package CoffeeTest1;
import java.util.Scanner;
public class Coffee {

	public static void main(String[] args) {
		
		System.out.println("�ް�Ŀ�ǿ� ���Ű��� ȯ���մϴ�.");
		
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("		Ŀ��            					������       					���̵�  ");
		System.out.println("1.�Ƹ޸�ī��			3,000�� 		  	4.���Ʈ ������	3,500��			6.ġ������		4,000��");
		System.out.println("2.ī���ī			3,500��			5.����   ������	4,000��			7.��������		4,000��");
		System.out.println("3.ī��ḶŰ�߶� 			4,000��");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		
		int choice = -1;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�޴��� ������.(1~7)");
		choice = scan.nextInt();
		
		System.out.println("������ �޴� : " + choice);
		System.out.println();
		
	}
	{
		
		
	}

}
