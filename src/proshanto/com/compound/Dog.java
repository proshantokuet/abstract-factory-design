package proshanto.com.compound;

public class Dog implements IAnimal {

	@Override
	public void eat() {
		System.err.println("Dog can eat...");

	}

	@Override
	public void sleep() {
		System.err.println("Dog can sleep");
	}

}
