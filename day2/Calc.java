package day2;
import java.util.Scanner;
public class Calc {

	public static void main(String[] args) {
		System.out.println("숫자 두개랑 연산자를 입력");
		
		Scanner scan = new Scanner(System.in);
		String num1 = scan.next();
		String opcode = scan.next();
		String num2 = scan.next();

		int a = Integer.parseInt(num1);
		int b = Integer.parseInt(num2);
		int result = 0; // 변수는 반드시 초기화 해야한다.

		if(opcode.equals("+")){
			result = a+b;
		}else if(opcode.equals("-")){
			result = a-b;
		}else if(opcode.equals("/")){
			result = a/b;
		}else if(opcode.equals("%")){
			result = a%b;
		}else if(opcode.equals("*")){
			result = a*b;
		}else{
			result = 0;
		}

		System.out.print(a+opcode+b+"="+result);

	}

}
