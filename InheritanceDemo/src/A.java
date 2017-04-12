
public class A {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		int legs = dog.getLegs();

		System.out.println("Legs:"+legs);
		
		dog.getBeha();//Boarking
		
		Bird b= new Bird();
		
		int blegs = b.getLegs();
		System.out.println(blegs);//2
		b.getBeha();//Fly
	}

}


class Animal{

	int getLegs(){
		return 4;
	}
	void getBeha(){
		System.out.println("Walking...");
	}
	
}

class Dog  extends Animal{
	
	void getBeha(){
		System.out.println("Boarking...");
	}
	
}
class Bird extends Animal{
	
	int getLegs() {
		return 2;
	}
	
	void getBeha(){
		System.out.println("Fly...");
	}
}