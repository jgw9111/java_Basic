package day8;
import java.util.Scanner;
import day8.Calc;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("[메뉴]0.종료 \n"
					+ "1.계산기\n "
					+ "2.bmi\n"
					+ "3.달력\n"
					+ "4.성별판독기\n"
					+ "5.성적");
			String select = scanner.next();
			switch(select) {
			case "0": System.out.println("시스템을 종료합니다."); return;
			case "1": 
				Calc calc =new Calc();
				calc.calc();
				break;
				
			case "2":
				Bmi bmi = new Bmi();
				break;
				
			case "3": 
				MyCalender calender = new MyCalender();
				break;
				
			case "4": 
				GenderChecker checker = new GenderChecker();
				break;
				
			case "5": 
				Grade grade = new Grade();
				break;
				
			default : break;
			
			}
		}
	
	}

}
