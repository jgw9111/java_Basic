package day9;

public class NameArray2 {
	public void test() {
		String[] names = {"홍길동","김유신","유관순"};
		String res = "";
		for(int i=0;i<names.length;i++) {
			if(i != names.length-1){
				res += names[i]+",";
			}else{
				res += names[i];
			}
			
		}
		System.out.println(res);

	}
		
	public static void main(String[] args) {
		NameArray2 nameArray = new NameArray2();
		nameArray.test();
		

	}
}
