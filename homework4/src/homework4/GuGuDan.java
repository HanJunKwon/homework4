package homework4;
import java.util.Scanner;

public class GuGuDan {
	int dan=0;
	GuGuDan(){}
	
	void guguCalc(){
		System.out.println("##����ϴ� ������ ����ϱ�");
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("����ϰ� ���� ��(Q:����) >> ");
			dan = sc.nextInt();
			
			if(dan>1 && dan<10){
				for(int i=1; i<10; ++i){
					if(i%2==0)
						System.out.printf("%d * %d = %d\n",dan,i,dan*i);
					else
						System.out.printf("%d * %d = %d     ",dan,i,dan*i);
				}
			}
			else if(dan=='Q')
				break;
			else
				System.out.println("===>�� �� �Է�");		
		}
	}

}
