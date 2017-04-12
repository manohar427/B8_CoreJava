
public class MethodExample {

	public static void main(String[] args) {
		System.out.println("program will start from here");
		displayName();
		int sum = add(10,20);
		System.out.println("Sum is:"+sum);
		
		String name = getName(10);
		
		System.out.println("Name is :"+name);
	}

	static void displayName(){
		System.out.println("Hi My name is John");
	}
	
	static int add(int a,int b){
		int c = a +b ;
		
		return c;
	}
	
	static String getName(int custId){
		//DB
		if(custId == 10){
			return "John";
		}else{
			return "Lori";
		}
	}
	
}
