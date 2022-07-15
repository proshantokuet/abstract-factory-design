package proshanto.com.compound;

public class ColorFactory implements IAbstractFactory<IColor> {

	private IColor color=null;
	@Override
	public IColor build(Types types) {
		switch (types) {
		case WHITE:
			color=new White();
			break;
		case BLACK:
			color=new Black();
		default:
			break;
		}
		
		return color;
	}
	

}
