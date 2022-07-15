package proshanto.com.compound;

public class Provider {
	
	
	@SuppressWarnings("rawtypes")
	public IAbstractFactory getFactory(FactoryType type){
		switch (type) {
		case ANIMAL:
			return new AnimalFactory();			
		case COLOR:
			return new ColorFactory();
			
		default:
			break;
		}
		
		return null;
	}

}
