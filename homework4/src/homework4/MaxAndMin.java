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
	
		String i;
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.print("���ڸ� �Է�(Q:����) >> ");
			i = sc.nextLine();
			
			if(i.equals("Q"))
				break;
			else if(Integer.parseInt(i)>=1 && Integer.parseInt(i)<=100){
				if(Integer.parseInt(i)>max)
					max=Integer.parseInt(i);
				else if(Integer.parseInt(i)<min)
					min=Integer.parseInt(i);
			}
			else continue;
		}
		System.out.printf("���� ū ���� %d�̰�, �������� %d�Դϴ�.\n",max, min);
		return;
	}
}
