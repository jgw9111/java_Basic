package day8;
import java.util.Scanner;

public class Calc {
	public void calc() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자,연산자,숫자");
		int a = scanner.nextInt();
		String op = scanner.next();
		int b = scanner.nextInt();
		int res = 0;
		
		switch (op) {
		case "+": res = a + b; break;
		case "-": res = a - b; break;
		case "*": res = a * b; break;
		case "/": res = a / b; break;
		case "%": res = a % b; break;
		}
		
		System.out.println(a+op+b+"="+res);
	}
}
