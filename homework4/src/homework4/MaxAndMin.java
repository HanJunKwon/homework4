package homework4;
import java.util.Scanner;
public class MaxAndMin {
	int max=0;
	int min=101;
	MaxAndMin(){}
	void MaxMin(){
		String i;
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("숫자를 입력하세요.(Q:종료) >> ");
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
		System.out.printf("최댓값은 %d이고, 최솟값은 %d입니다.\n",max, min);
		return;
	}
}
