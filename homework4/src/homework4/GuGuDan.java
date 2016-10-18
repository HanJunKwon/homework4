package homework4;
import java.util.Scanner;

public class GuGuDan {
	String dan;
	GuGuDan(){}
	
	void guguCalc(){
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("숫자를 입력하세요.(Q:종료) >> ");
			dan = sc.nextLine();
			
			if(dan.equals("Q"))
				break;
			else if(Integer.parseInt(dan)>1 && Integer.parseInt(dan)<10){
				for(int i=1; i<10; ++i){
					int r= Integer.parseInt(dan)*i;
					System.out.println(dan+"*"+i+"="+r);
				}
			}
			else
				System.out.println("===>잘못 입력");		
			
		}
	}

}
