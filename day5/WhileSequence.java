package day5;
import java.util.Scanner;
public class WhileSequence {

	public static void main(String[] args) {
        System.out.println("숫자를 입력하세요");
        Scanner scan = new Scanner(System.in);

        int limit = scan.nextInt();
        int count = 1;
        String res = "";
        int sum = 0;

        while(count <= limit){
            if(count != limit ){
                res += count + "+" ;
            }else{
                res += count +"=" ;
            }
            sum += count;
            count ++;
        }
        System.out.print(res+sum);
	}

}
