package homework4;
import java.util.Scanner;
public class MaxAndMin {
	int max;
	int min;
	MaxAndMin(){
		max=0;
		min=100;
	}
	void MaxMin(){
		System.out.println("###�ִ밪/�ּҰ����ϱ�");
	
		int i;
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.print("���ڸ� �Է�(Q:����) >> ");
			i = (int)sc.nextInt();
			if(i==113)
				break;
			else if(i>=0 && i<=100){
				if(i>max)
					max=i;
				else if(i<min)
					min=i;
			}
			else continue;
		}
		System.out.printf("���� ū ���� %d�̰�, �������� %d�Դϴ�.",max, min);
		return;
	}
}
