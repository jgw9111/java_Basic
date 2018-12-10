package day5;
import java.util.Random;
public class MyRandom {

	public static void main(String[] args) {
	     System.out.println("랜덤 출력");
	     Random random = new Random();
	     int limit = random.nextInt(11)+1;
	     System.out.println("랜덤: "+ limit);     
	     String res = "";
	     int count = 1;
	     int sum = 0;


	     while(count <= limit){
	         if(count != limit){
	             res += count+"+";
	         }else{
	             res += count+"=";
	         }
	        sum += count;        
	        count ++;

	     }
	     System.out.println(res+sum);
	}

}
