package day6;

import java.util.Scanner;

public class momo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("[메뉴] "+ "\n0.종료 "+ "\n1.계산기 "+ "\n2.Bmi "+ "\n3.윤년계산기 "+ "\n4. 성별 판별기 "+ "\n5.등수구하기");
			String system = scanner.next();
						
			switch(system) {
			case "0" : 
				System.out.println("시스템을 종료합니다.");
				return;
				
			case "1":
				System.out.println("숫자, 연산자, 숫자를 입력하세요.");
				int a = scanner.nextInt();
				String op = scanner.next();
				int b = scanner.nextInt();
				int res = 0;
				
				
				switch(op) {
				case "+" : 
					res = a+b;					
					break;
				case "-" : 
					res = a-b;					
					break;
				case "*" : 
					res = a*b;					
					break;
				case "/" : 
					res = a/b;					
					break;
				case "%" : 
					res = a+b;					
					break;
				default: res = 0; break;
					
				}
				
				System.out.println(a+op+b+"="+res);	
				
				break;				
				
			case "2":
				System.out.println("몸무게: ");
				double w = scanner.nextDouble();
				System.out.println("키: ");
				double h = scanner.nextDouble();
				
				double bmi = w/(h*h*0.0001);
				String res2 = "";
				
				if(bmi >= 40) {
					res2 = "고도비만";
				}else if(bmi >= 35) {
					res2 = "중등도 비만";					
				}else if(bmi >= 30) {
					res2 = "경도비만";
				}else if(bmi >= 25) {
					res2 = "과체중";
				} else if(bmi >= 18.5) {
					res2 = "정상";
				} else{
					res2 = "저체중";
				}
				
				System.out.println("bmi :" + bmi + "="+ res2);
				break;
				
			case "3" : 
				System.out.println("년도를 입력하세요");
				int year = scanner.nextInt();
				String res3 = "";
				if(year%4 == 0 && year%100 !=0 || year%400==0) {
					
					
				}else {}
				
				break;
			}
			
		}
	}

}
