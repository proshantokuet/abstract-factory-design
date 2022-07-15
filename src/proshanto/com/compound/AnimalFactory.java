package proshanto.com.compound;

@SuppressWarnings("rawtypes")
public class AnimalFactory implements IAbstractFactory<IAnimal> {

	private IAnimal animal=null;
	@Override
	public IAnimal build(Types types) {
		switch (types) {
		case DOG:
			animal=new Dog();
			break;
		case DUCK:
			animal=new Duck();
		default:
			break;
		}
		
		return animal;
	}
	

}
