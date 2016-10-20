package homework4;

import java.util.Scanner;

public class ExamForWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("1. 1부터 입력한 수까지 더하기");
			System.out.println("2. 최댓값/최솟값 구하기");
			System.out.println("3. 입력받은  숫자의 합계와 평균구하기");
			System.out.println("4. 원하는 구구단 출력하기");
			System.out.println("5. 짝수단/홀수단 출력하기");
			System.out.println("6. 종료하기");
			System.out.print("원하는 메뉴는>>");
			int select = sc.nextInt();

			if (select == 1) 
				new SumOfNumbers().Sum();
			 else if (select == 2) 
				new MaxAndMin().MaxMin();
			 else if (select == 3) {
				SumAndAvg sumAvg = new SumAndAvg();
				sumAvg.Sum();
				sumAvg.Avg();
			 }
			 else if (select == 4) 
				new GuGuDan().guguCalc();
			 else if (select == 5) 
				new GuGuDan2().guguCalc();
			 else if (select == 6)
				System.exit(0);
		}
	}
}
