package proshanto.com.compound;


public class Test {

	public static void main(String[] args) {
		Provider provider=new Provider();
		IAnimal dog = (IAnimal) provider.getFactory(FactoryType.ANIMAL).build(Types.DOG);
		
		dog.eat();
		dog.sleep();
		
		IColor white=(IColor) provider.getFactory(FactoryType.COLOR).build(Types.BLACK);
		System.err.println(white.getColor());
		
	}

}
