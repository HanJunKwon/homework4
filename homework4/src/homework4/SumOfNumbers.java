package homework4;
import java.util.Scanner;
public class SumOfNumbers {
	int sum;
	int num;
	
	SumOfNumbers(){
		sum=0;
		num=0;
	}
	
	void Sum(){
		Scanner sc = new Scanner(System.in);
		System.out.println("###1���� �Է��� ������ ���ϱ�");
		System.out.println("������ ���� �Է�(Q:����) >>");
		num =  sc.nextInt();
		for(int i=1; i<=num; ++i)
			sum+=i;
		System.out.printf("�� ���� %d�Դϴ�.",sum);
		return;
	}
}
