package day9;
import java.util.Scanner;
public class Gugudan {
	public void gugudan() {
		System.out.println("몇 단을 출력할까요?");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String res = "";
		for(int i=1;i<10;i++) {
			res += n+"*"+ i +"="+n * i+"\n";
			
		}
		System.out.println(res);
	}
	
}
