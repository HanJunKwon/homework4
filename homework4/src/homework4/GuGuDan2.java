package homework4;
import java.util.Scanner;
public class GuGuDan2 {
	GuGuDan2(){}
	
	void guguCalc(){
		String s;
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.print("E:짝수단, O:홀수단(Q:종료) >> ");
			s = sc.nextLine();
			if(s.equals("Q"))
				break;
			
			int i =2;
			if(s.equals("O")) i =3;
			for(; i<10; i+=2){
				for(int j=1; j<10; ++j)
					System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
		}
	}
}
