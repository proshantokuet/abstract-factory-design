package proshanto.com.compound;

public interface IAbstractFactory<T> {
	public T build(Types type);
}
