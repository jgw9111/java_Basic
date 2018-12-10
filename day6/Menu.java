package day6;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {

			System.out.println("[메뉴] \n 0.종료 \n"
					+ "1.계산기 \n "
					+ "2.Bmi지수\n "
					+ "3.윤년계산\n" 
					+ "4.주민번호 \n"
					+ "5.등수구하기");
			String select = scanner.next();
			
			switch(select) {
			case "0": 
				System.out.println("종료"); 
				return;
				
			case "1": //계산기
				System.out.println("숫자, 연산자, 숫자 입력");
				int a = scanner.nextInt();
				String op = scanner.next();
				int b = scanner.nextInt();
				int res = 0;
				
				switch (op) {
				case "+": res = a+b; break;
				case "-": res = a-b; break;
				case "*": res = a*b; break;
				case "/": res = a/b; break;
				case "%": res = a+b; break;					
				default: res = 0; break;
				}
				System.out.println(res);
				break;
				
			case "2": //bmi
				System.out.println("몸무게:");
				double w = scanner.nextDouble();				
				System.out.println("키: ");
				double h = scanner.nextDouble();

				double bmi = w/(h*h*0.0001);
				
				System.out.println("bmi : " +bmi);
				String res2 = "";
				
				if(bmi >= 40) {
					res2 = "고도 비만";
				}else if(bmi >= 35) {
					res2 = "중등도 비만";
				}else if(bmi >= 25) {
					res2 = "경도 비만";
				}else if(bmi >= 18.5){
					res2 = "정상";
				}else{
					res2 = "저체중";
				}
				
				System.out.println(res2);
				
				break;
				
			case "3" : //윤년
				System.out.println("년도를 입력하세요");
				int year = scanner.nextInt();
				System.out.println("년도 : "+ year);
				String ly = "";
							
				if(year%4 == 0 && year%100 != 0 || year%400 == 0) {
					ly = "윤년";
				}else {
					ly = "평년";
					
				}
				
				System.out.println(ly);
				
				break;
			
			case "4" : //성별 판별기
				System.out.println("이름과 주민등록번호를 입력하세요");
				String name = scanner.next();
				String ssn = scanner.next();
				char ch = ssn.charAt(7);
				
				String gender ="";
				if(ch=='0'||ch=='7'||ch=='8'||ch=='9'){
					gender = "잘못된 결과입니다.";
				}else if(ch=='1'||ch=='3'){
					gender = "남자";
				}else if(ch=='2'||ch=='4'){
					gender = "여자";
				}else{}
					gender = "외국인";
				
				System.out.println(name + ":" + ssn + ":" + gender);
				
				break;	
			
			case "5" : //등수구하기
				System.out.println("세명의 이름과 점수를 입력하세요");
				String f = scanner.next();
				int f1 = scanner.nextInt();
				String s = scanner.next();
				int s1 = scanner.nextInt();
				String t = scanner.next();
				int t1 = scanner.nextInt();
				
				String res3 = "";
				
				
				if(f1>s1 && f1>t1) { 
					if(s1>t1) {
						res3 = ("1등" +": " + f +": "+f1 + 
							   "\n2등" +": " + s +": "+s1 +
							   "\n3등" +": " + t +": "+t1) ;
						
					}else {
						res3 = ("1등" +": " + f +": "+f1 + 
							   "\n2등" +": " + t +": "+t1 +
							   "\n3등" +": " + s +": "+s1) ;
						
					}

				}else if(s1>t1 && s1>f1){
					if(t1>f1) {
						res3 = ("1등" +": " + s +": "+s1 + 
							   "\n2등" +": " + t +": "+t1 +
							   "\n3등" +": " + f +": "+f1) ;						
						
					}else {
						res3 = ("1등" +": " + s +": "+s1 + 
							   "\n2등" +": " + f +": "+f1 +
							   "\n3등" +": " + t +": "+t1) ;
					}
				}else if(t1>s1 && t1>f1){
					if(s1>f1) {
						res3 = ("1등" +": " + t +": "+t1 + 
							   "\n2등" +": " + s +": "+s1 +
							   "\n3등" +": " + f +": "+f1);	
					}else {
						res3 = ("1등" +": " + t +": "+t1 + 
							   "\n2등" +": " + f +": "+f1 +
							   "\n3등" +": " + s +": "+s1) ;	
					}
					
				}else{
					res3= "잘못된 결과입니다";
				}
				
				System.out.println(res3);
				
								
				break;
				
				
			}
			
		}
	
	}

}
