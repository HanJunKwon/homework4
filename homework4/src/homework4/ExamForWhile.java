package homework4;
import java.util.Scanner;
public class ExamForWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1.1���� �Է��� ������ ���ϱ�");
		System.out.println("2. �ִ밪/�ּҰ����ϱ�");
		System.out.println("3. �Է¹��� ������ �Ձ�ȭ ��ձ��ϱ�");
		System.out.println("4. ���ϴ� ������ ����ϱ�");
		System.out.println("5. ¦����/Ȧ���� ����ϱ�");
		System.out.println("6. �����ϱ�");
		System.out.println("���ϴ� �޴��� >>");
		int select =sc.nextInt();
		
		if(select==1){
			SumOfNumbers sumNum = new SumOfNumbers();
			sumNum.Sum();
		}
		else if(select==2){
			MaxAndMin maxmin = new MaxAndMin();
			maxmin.MaxMinCalc();
		}
		else if(select==3){
			SumAndAvg sumAvg = new SumAndAvg();
			sumAvg.avg();
		}
		else if(select==4){
			GuGuDan gugu = new GuGuDan();
			gugu.guguCalc();
		}
		else if(select==5)
			GuGUDan2 gugu2 = new GuGuDan();
		else if(select==6)
			return;
	}

}
