package day9;
import java.util.Scanner;
import day9.Bmi;
import day9.ForDemo;
import day9.LeapYear;
import day9.OddSum;
import day9.Calc;
import day9.Gugudan;
import day9.NameArray2;
import day9.ScoreArray;
import day9.NameScoreArray;
public class Main {

	public static void main(String[] args) {

		while(true) {
		Scanner scanner = new Scanner(System.in);	
		System.out.println("[메뉴] 0.종료\n "
				+ "1.계산기 \n"
				+ "2.bmi계산기 \n"
				+ "3.윤년계산기\n"
				+ "4.성별판독기 \n"
				+ "5.ForDemo \n"
				+ "6.구구단 \n"
				+ "7.홀수의 합 \n"
				+ "8.이름배열 \n"
				+ "9.성적배열 \n"
				+ "10.이름과 성적배열 ");
		String select = scanner.next();
		switch(select) {
		case "0": System.out.println("시스템을 종료합니다.");return;
		case "1": 
			Calc c = new Calc();
			c.Calc();
			break;
		case "2": 
			Bmi bmi = new Bmi();
			bmi.test();
			break;
		case "3":
			LeapYear ly = new LeapYear();
			ly.leapyear();
			break;
		case "4": 
			GenderChecker gen = new GenderChecker();
			gen.test();
			break;
		case "5":
			ForDemo forDemo = new ForDemo();
			forDemo.test();
			break;
		case "6":
			Gugudan gu = new Gugudan();
			gu.gugudan();
			break;
		case "7": 
			OddSum odd = new OddSum();
			odd.oddsum();
			break;
		case "8": 
			NameArray2 na = new NameArray2();
			na.test();
			break;
		case "9":
			ScoreArray sc = new ScoreArray();
			sc.test();
			break;
		case "10":
			NameScoreArray ns = new NameScoreArray();
			ns.test();
			break;
		default :
			System.out.println("잘못 입력하셨습니다");
			break;
		}
		}
		
	}

}
