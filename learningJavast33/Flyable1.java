package learningJavast33;
// creating interface
public interface Flyable1 {
	void fly_obj();
	
}
//making sub classes
class Spacecraft implements Flyable1{

	@Override
	public void fly_obj() {
		// TODO Auto-generated method stub
		System.out.println("flyes with thrusters");
		
	}
	
}
//making sub classes
class Airplane implements Flyable1{

	@Override
	public void fly_obj() {
		// TODO Auto-generated method stub
		System.out.println("flyes with wings and engines");
		
	}
	
}
//making sub classes
class Helicopter implements Flyable1{

	@Override
	public void fly_obj() {
		// TODO Auto-generated method stub
		System.out.println("flyes with rotor blades");
		
	}
	//main method declaration inside the class of my choice.
	public static void main(String [] ar) {
		Spacecraft obj1 = new Spacecraft();
		obj1.fly_obj();
		Helicopter obj2 = new Helicopter();
		obj2.fly_obj();
		Airplane obj3 = new Airplane();
		obj3.fly_obj();
	}
	
}
