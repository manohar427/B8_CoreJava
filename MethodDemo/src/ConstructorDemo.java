
public class ConstructorDemo {

	public static void main(String[] args) {
		
		A obj = new A();//1
		int sum = obj.add(10, 30);
		
		System.out.println("Sum is:"+sum);

		A obj2 = new A(100,200);//2
	}

}


class A
{
	int add(int a,int b){
		int c = a+b;
		return c;
	}
	
	A(){
		System.out.println("A()");
	}
	
	A(int x,int y){
		System.out.println("A(int x,int y)");
	}
}