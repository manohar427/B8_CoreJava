
public class MethodExample2 {

	String defaultName;
	
	public static void main(String[] args) {
		
		//Object creation
		MethodExample2 obj = new MethodExample2();
		
		int sum = obj.add(10,20,30);
		
		System.out.println("Sum is:"+sum);
		
		obj.getAddress(400);
		
		
		System.out.println(obj.defaultName);
		
		
		

	}
	
	
	int add(int a,int b,int c){
		int d = a + b + c;
		return d;
	}
	
	void getAddress(int custId){
		
		if(custId == 100){
			System.out.println("Bangalore IN");
		}else if(custId == 200){
			System.out.println("Wallstreet NY");
		}else{
			System.out.println("Not found");
		}
	}
	
	 MethodExample2() {
	  System.out.println("MethodExample2()");
	  
	 defaultName = "This is default name John";
	}
	
	

}
