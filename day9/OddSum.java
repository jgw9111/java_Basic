package day9;
import java.util.Scanner;

public class OddSum {
	public void oddsum() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int limit = scanner.nextInt();
		String res = "";
		int sum = 0;
		
		for(int i=0;i<=limit;i++) {
			if(i%2 != 0 ) {
				sum += i;
			}
		}
		System.out.println(res+sum);
	}

	
}
