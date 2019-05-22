
public interface BikeBuilder {
	
	public Bike buildBike(int size, int width, int weight, String color, int count);

	public ITire buildTires(int size, int width);
	
	public IFrame buildFrame(int weight, String color);

	public IGear buildGear(int count);
}
