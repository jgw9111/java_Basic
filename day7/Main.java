package day7;
import java.util.Scanner;
import day7.Calc;
import day7.Bmi;
import day7.Leapyear;
import day7.Gender;
import day7.Grade;


public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("[메뉴] 0.종료 1.계산기 2.bmi 계산기 3.윤년계산기 4.성별판별기 5.등수구하기");
			String select =s.next();
			
			switch(select) {
			case "0" :
				System.out.println("시스템이 종료되었습니다");
				return;
			case "1" : 
				Calc c = new Calc();
				c.payByJungUk();
				break;
			case "2" : 
				Bmi b = new Bmi();
				b.Bmical();
				break;
			case "3" : 
				Leapyear l =new Leapyear();
				l.Leapcal();
				break;
			case "4" : 
				Gender g = new Gender();
				g.Gendercal();
				break;
			case "5" :
				Grade g1 = new Grade();
				g1.Gradecal();
				break;
				
			}
		
		}
		
		
	}
}
