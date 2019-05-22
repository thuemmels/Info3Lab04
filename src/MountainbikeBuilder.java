
public class MountainbikeBuilder implements BikeBuilder {
	public Bike buildBike(int size, int width, int weight, String color, int count) {
		Bike bike = new Mountainbike();
		ITire tire = buildTires(size, width);
		IFrame frame = buildFrame(weight, color);
		IGear gear = buildGear(count);
		bike.setTire(tire);
		bike.setFrame(frame);
		bike.setGear(gear);
		bike.setType("Mountainbike");
		return bike;
	}

	public ITire buildTires(int size, int width) {
		return new MountainbikeTire(size, width);
	}
	
	public IFrame buildFrame(int weight, String color) {
		return new MountainbikeFrame(weight, color);
	}
	
	public IGear buildGear(int count) {
		return new MountainbikeGear(count);
	}
}
