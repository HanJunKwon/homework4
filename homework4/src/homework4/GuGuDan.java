package homework4;
import java.util.Scanner;

public class GuGuDan {
	String dan;
	GuGuDan(){}
	
	void guguCalc(){
		System.out.println("###���ϴ� ������ ����ϱ�");
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("����ϰ� ���� ��(Q:����) >> ");
			dan = sc.nextLine();
			
			if(dan.equals("Q"))
				break;
			else if(Integer.parseInt(dan)>1 && Integer.parseInt(dan)<10){
				for(int i=1; i<10; ++i){
					if(i%2==0)
						System.out.printf("%d * %d = %d\n",Integer.parseInt(dan),i,Integer.parseInt(dan)*i);
					else
						System.out.printf("%d * %d = %d     ",Integer.parseInt(dan),i,Integer.parseInt(dan)*i);
				}
				System.out.println();
			}
			else
				System.out.println("===>�� �� �Է�");		
			
		}
	}

}
