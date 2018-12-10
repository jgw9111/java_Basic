package day9;

import java.util.Random;

public class LottoNumberGen {
	public void test() {
		// Lotto 6개의 랜덤 숫자.
		// 1~45 까지의 랜덤 숫자 발생 
		Random random = new Random();
		int[] lotto = new int[6];
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = random.nextInt(45)+1;
			System.out.print(lotto[i]+" ");
		}
	}
}
