package day7;
import java.util.Scanner;

public class Calc {
	public void payByJungUk() {

		
		System.out.println("숫자, 연산자, 숫자를 입력하세요");
		Scanner scanner = new Scanner(System.in);		
		int a = scanner.nextInt();
		String op = scanner.next();
		int b = scanner.nextInt();
		int res = 0;
		
		switch(op) {
		case "+" : res = a+b; break;
		case "-" : res = a-b;break;
		case "*" : res = a*b;break;
		case "/" : res = a/b;break;
		case "%" : res = a%b;break;
		default : res = 0; break;
		
		}
		
		System.out.println(a+op+b+"="+res);
		
	}
}
