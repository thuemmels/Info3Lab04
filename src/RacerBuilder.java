
public class RacerBuilder implements BikeBuilder {
	public Bike buildBike(int size, int width, int weight, String color, int count) {
		Bike bike = new Racer();
		ITire tire = buildTires(size, width);
		IFrame frame = buildFrame(weight, color);
		IGear gear = buildGear(count);
		bike.setTire(tire);
		bike.setFrame(frame);
		bike.setGear(gear);
		bike.setType("Racer");
		return bike;
	}

	public ITire buildTires(int size, int width) {
		return new RacerTire(size, width);
	}
	
	public IFrame buildFrame(int weight, String color) {
		return new RacerFrame(weight, color);
	}
	
	public IGear buildGear(int count) {
		return new RacerGear(count);
	}
}
