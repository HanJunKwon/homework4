package homework4;
import java.util.Scanner;
public class SumAndAvg {
	int num=0;
	int sum=0;
	int avg=0;
	int cnt=0;
	SumAndAvg(){}
	
	void Sum(){
		System.out.println("###�Է¹��������� �հ�� ��� ���ϱ�");
		int num;		
		while(true){
			Scanner sc = new Scanner(System.in);
			
			System.out.print("���ڸ� �Է�(Q:����) >> ");
			num = sc.nextInt();
			if(num=='Q')
				break;
			sum+=num;
			++cnt;
		}
		System.out.printf("�հ�� %d�̰�, ",sum);
	}
	void Avg(){
		System.out.printf("�����  %.2f�Դϴ�", sum/cnt);
	}

}
