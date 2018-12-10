package day6;
import java.util.Scanner;
public class S1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("[메뉴]0.종료 1.오칙연산 2.BMi 3. 윤년 계산기 4.성별 판별기 5.등수구하기");
			String r = scan.next();
			switch(r) {
			case "0" :
				System.out.println("종료");
				return;
			case "1" :
				System.out.println("1.오칙연산");
				int a = scan.nextInt();
				String b = scan.next();
				int c = scan.nextInt();
				int result = 0;
				switch(b) {
				case "+" : result = a+c; break;
				case "-" :  result = a-c; break;
				case "*" : result = a*c; break;
				case "/" : result = a/c; break;
				case "%" : result = a%c; break;
				default : result = 0; break;
				}
				System.out.println(result);
				break;
				
				case "2" : 
					System.out.println("몸무게:");
					double w = scan.nextDouble();
					System.out.println("키:");
					double h = scan.nextDouble();
					
					double bmi = w/(h*h*0.0001);
					System.out.println("bmi:"+bmi);
					String res = "";
					
					if(bmi >= 40) {
						res = "고도비만";
					}else if(bmi >=35){
						res = "중등도 비만";
					}else if(bmi >=30){
						res = "경도비만";
					}else if(bmi >= 25){
						res = "과체중";
					}else if(bmi >=18.5){
						res = "정상";
					}else{
						res = "저체중";
					}
					
					System.out.println(res);
									
					break;		
				
				case "3" : 
					System.out.println("연도를 입력");
					int y = scan.nextInt();
					String n = "";
					if(y%4==0 && y%100!=0 || y%400==0) {
						n = "윤년";
					}else {
						n="평년";
					}
					System.out.println(y+"년은"+n);
					
					break;
				case "4" :
					System.out.println("이름을 입력하세요");
					String name = scan.next();
					System.out.println("주민번호를 입력하세요");
					String num = scan.next();
					String result100 = "";
					
					char aaa = num.charAt(7);
					
					switch(aaa) {
					case '1' : result100 = "남자"; break;
					case '3' : result100 = "남자"; break;
					case '2' : result100 = "여자"; break;
					case '4' : result100 = "여자"; break;
					case '5' : result100 = "외국인"; break;
					case '6' : result100 = "외국인"; break;
					default : result100 = "다시입력하세요"; break;
					}
					System.out.println(name+result100);
					
					break;
				case "5" :
					System.out.println("이름     점수");
					String na1 = scan.next();
					int a1 = scan.nextInt();
					String na2 = scan.next();
					int a2 = scan.nextInt();
					String na3 = scan.next();
					int a3 = scan.nextInt();
					String res1 = ""; 
					
					if(a1>a2 && a1>a3) {
						if(a2>a3) {
							res1 = "1등 "+na1 +" 2등 "+na2 +" 3등 "+na3;
						}else {
							res1 = "1등 "+na1 +" 2등 "+na3 +" 3등 "+na2;
						}
					}else if(a2>a1 && a2>a3) {
						if(a1>a3) {
							res1 = "1등 "+na2 +" 2등 "+na1 +" 3등 "+na3;
						}else {
							res1 = "1등 "+na2 +" 2등 "+na3 +" 3등 "+na1;
						}
					}else {
						if(a2>a1) {
							res1 = "1등 "+na3 +" 2등 "+na2 +" 3등 "+na1;
						}else {
							res1 = "1등 "+na3 +" 2등 "+na1 +" 3등 "+na2;
						}
					}
					System.out.println(res1);
					break;
			} 
		}
	}

}
