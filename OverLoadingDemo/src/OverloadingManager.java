
public class OverloadingManager {

	public static void main(String[] args) {
		
		Clac  c = new Clac();
		int sum = c.add(20, 30);
		int sum2 = c.add(20, 30,40);
		
		System.out.println("Sum is :"+sum);
		System.out.println("Sum is :"+sum);
	}

}


class Clac{
	
	int add(int a,int b){
		int c= a+b;
		return c;
	}
	
	int add(int a,int b,int c){
		int d= a+b+c;
		return d;
	}
}