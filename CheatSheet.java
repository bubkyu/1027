import java.util.Scanner; //��ĳ�� ���.1
import Project01.Pro10;
import java.util.Random; // ���� ���
import java.io.*; //���۸��δ� �غ�

public class Cheatsheet {

	public static void main(String[] args) {

		////////////////////��ĵ, ���� , ���۸��δ� ////////////////////		
	
		Scanner scan = new Scanner (System.in); // ��ĳ�� ���.2
		int c = scan.nextInt();  // c �� Ű���� �Է¹ޱ�

		Random random = new Random(); // �������
		int a = random.nextInt(100); // 100������ ��������

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //���۸��δ� ��� (System.in)= Ű���������
		//���۸��δ��� ���ڷι޾Ƽ�  ��Ʈ������ ��ȯ 
        String str1 = br.readLine(); 
        int num1 = Integer.parseInt(str1);
       
        
		////////////////////������////////////////////	
				if (a>b && a>c) // && �׸���
				if (a>b || a>c) // ||�Ǵ� 
				if (a>b != a>c) // != �ƴϴ� 
				else if(b == 2) // ���� ��
				else if(b = 2)	 // ���� ����  �����ʿ��� ���� ����


				System.out.println("����"); //���

		////////////////////�迭 ////////////////////	
				
				
				int [] A = {5,9,3}; //�迭�� ���Ƿ� ����

				int [] B = new int [10]; //�迭 ������ ����  0���� 9����������ϴ°� *1���� 10������ �ƴ�*

				String[] itstring = new String[3]; // ��Ʈ�� ���� ����

				int c = 1; 
				int c = scan.nextInt();  // c �� Ű���� �Է¹ޱ�

				///�߸��� �迭����///
				

				int []myScores;  
				char []myChars;
				int [5] love ;  //x   �迭���鶧 ������� �������� ���� �Ⱥٴ´�
				Dog myDogs1[];	//Ŭ������ �迭   
				Dog myDog2[7]; //x
		
				
				
		////////////////////for �� ////////////////////	
				for(;;) { // ���� ����
	}
				for(int i = 0 ; i<5; i++) //���� �⺻���
				System.out.println(test[0]);
				System.out.println(test[0]);



		////////////////////�迭�� ���� �ּڰ� �ִ�////////////////////	
					for(int i=0; i<a.length;i++) {
						if(max<a[i]) {  //max < a �̸�  �ִ��� a 
							max = a[i];
						}
						if(min>a[i]) { //min > a �̸�  �ּڰ��� a 
							min = a[i];	

		////////////////////�ִ� �ּڰ� ���׿�����	////////////////////	
						int max = b[0] > b[1] ? (max = b[0]) : (max = b[1]) ;
						max = max > b[2] ? max : (max = b[2]) ;
							
						int min = b[0] > b[1] ? (min = b[1]) : (min = b[0]) ;
						      min = min < b[2] ? min : b[2];
						      // �ִ� �ּڰ� ���׿�����		
							
							
							
							
							
		//////////////////// �迭 �������ϴ� for �� ////////////////////	
							for(int i=0; i<a.length;i++) {
								sum+=a[i];  //������� ���ϴ� for ��
							}
		////////////////////�迭�� �Ƕ�̵� ����////////////////////	
							
							int[] [] a = new int [3][];
							a[0] = new int [3];
							a[1] = new int [2];
							a[2] = new int [3];
							
							
							��   // �̷����� �Ƕ�̵� ��簡��
							����
							������
							
							
							
		////////////////////class �迭////////////////////	
							Grade[] grade = new Grade[];
					//		������ Ŭ���� �迭�� �����̾ȵǼ� 
							grade[i] = new Grade[]; 
					//		�����ȿ� ��������Ѵ� �̰ɽ��ִ� ������ Ŭ���� �迭�� ���������
					//		(������ �ҷ�����)
					//		Ǯ���
							grade[0] = new Grade[]; 
							grade[1] = new Grade[]; 
							grade[2] = new Grade[]; 
							
					//		�̷��� ���Եȴ�
							
							
							
							void run() {
								input();
								output();
							}
					// �̷������� ¥���Ѵ�  �����ȿ� input() ���°Ǻ���
							
							
							
		////////////////////�޼ҵ�////////////////////	
							class best{   ///Ŭ����

								public best(){/// ������

								}

								void input() { ///�޼ҵ�

								}



								//�� Ŭ���� ����
								Class main{
									Classname Best = new Classname();
									best.input();  

								}

							}

							
		////////////////////while || ����////////////////////	
							while(btrue || ff) { // �Ѵ� �����ҋ� �������´�  || �ٿ��� ��� ���ü��ִ�  	
							
							}
							
							
		////////////////////���Ͽ�����////////////////////	
							
						 int res =	a > 5  ? 1 : -1 ;		//a �� 5����ũ�� 1 ����� �ƴϸ� - 1 �� ��ƶ�	
						 
			
							(a > b) ? "a�� b���� ũ��" : (a < b) ? "b�� a���� ũ��" : "a�� b�� ����." ;
						 	(���ǽ�) ?       �� 		: (���ǽ�) ? 				�� : ���� ;
							
			
					}
						
					}
					
					
		////////////////////����Ŭ����////////////////////		
					interface Show{
						public void show();
						public void count(); ////�̰������Ÿ�
					}
					
					
					class <�����̸�> implements Show{
						public void show();{
					}
						public void count() { }  //�̷� ��Ŷ� �ϳ� ���ʿ��ϴ�
					}
					////����
					public static void main(String[]args) 
					{//���ξȿ���
						Show s = new Show() {
							public void show() {
								System.out.println("����Ŭ���� show ����");
								
							////�Ｎ���� ���� �� ��������
							}
							s.show();
							}
						}
					
					
					}
					}
					


		////////////////////toString////////////////////	
					
				public String toString(){
					return"�����ϴ� �����Դϴ�";
							
				}