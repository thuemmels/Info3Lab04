
public class BikeDirector {
	public Bike constructBike(BikeBuilder bikeBuilder, int size, int width, int weight, String color, int count) {
		return bikeBuilder.buildBike(size, width, weight, color, count);
	}
}
